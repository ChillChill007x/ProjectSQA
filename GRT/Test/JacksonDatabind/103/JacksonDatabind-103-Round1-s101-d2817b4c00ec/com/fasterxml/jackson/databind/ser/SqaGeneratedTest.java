package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "')]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.Annotated)v20).getName();
    Object v22 = 10;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = "Could not find creator property with name '%s' (known Creator properties: %s)";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v6),((java.lang.String)v7),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = true;
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultBean();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "<";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = 10;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).toString();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getClassAnnotations();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v7),((com.fasterxml.jackson.databind.BeanDescription)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = 10;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = java.util.Map.of(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v7).withAttributes(((java.util.Map)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v7),((com.fasterxml.jackson.databind.BeanDescription)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = true;
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = false;
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v22).equals(((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = 10;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 10;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v15 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v7).getDefaultInclusion(((java.lang.Class)v10),((java.lang.Class)v13),((com.fasterxml.jackson.annotation.JsonInclude.Value)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v7),((com.fasterxml.jackson.databind.BeanDescription)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = false;
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "j";
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' of default ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = 10;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "[null]";
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "'";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 10;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "V";
    Object v4 = -17;
    Object v5 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "true";
    Object v4 = true;
    Object v5 = "[reference type, class ";
    Object v6 = 26;
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v4),((java.lang.String)v5),((java.lang.Integer)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "4";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = 10;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v22).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ",5 ";
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = false;
    Object v15 = 10;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "stri";
    Object v4 = "string";
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "'";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v6),((java.lang.Object)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 10;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isContainerType();
    Object v4 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "; expected Class<ValueInstantiator>";
    Object v4 = "string";
    Object v5 = java.io.File.createTempFile(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new java.io.PrintWriter(((java.io.File)v5));
    ((java.lang.Throwable)v2).printStackTrace(((java.io.PrintWriter)v6));
    Object v7 = null;
    Object v8 = "'";
    Object v9 = 10;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v8),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s";
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "integer";
    Object v4 = -17;
    Object v5 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).hasAnnotation(((java.lang.Class)v14));
    Object v16 = true;
    Object v17 = 10;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "null";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "trje";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).getErasedSignature();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " with 2 type parameters: class'expects ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "NO$N_EMPTY";
    Object v4 = true;
    Object v5 = "[reference type, class ";
    Object v6 = 26;
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v4),((java.lang.String)v5),((java.lang.Integer)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "f&lse";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "not a valid representation";
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = false;
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "DATE_^TIME";
    Object v4 = "string";
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "array";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new java.io.PrintStream(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = true;
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v5),(((java.lang.Boolean)v6).booleanValue()),((java.nio.charset.Charset)v7));
    ((java.lang.Throwable)v2).printStackTrace(((java.io.PrintStream)v8));
    Object v9 = null;
    Object v10 = "_";
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v10),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = 10;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "Failed to setValue() for field ";
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = true;
    Object v5 = "[reference type, class ";
    Object v6 = 26;
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v4),((java.lang.String)v5),((java.lang.Integer)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "true";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "L";
    Object v4 = "string";
    Object v5 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = 10;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).getAnnotation(((java.lang.Class)v22));
    Object v24 = true;
    Object v25 = 10;
    Object v26 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v24).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "it&ms";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).equals(((java.lang.Object)v13));
    Object v15 = 10;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v8 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v6),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = false;
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isFinal();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ";";
    Object v5 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = com.fasterxml.jackson.databind.SerializationFeature.FLUSH_AFTER_WRITE_VALUE;
    Object v9 = new com.fasterxml.jackson.databind.SerializationFeature[]{};
    Object v10 = ((com.fasterxml.jackson.databind.SerializationConfig)v7).with(((com.fasterxml.jackson.databind.SerializationFeature)v8),((com.fasterxml.jackson.databind.SerializationFeature[])v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v7),((com.fasterxml.jackson.databind.BeanDescription)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ", ";
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "[SuffixTransformer('";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12).getFullName();
    Object v14 = 10;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = 10;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v14).isTypeOrSubTypeOf(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3));
    ((java.lang.Throwable)v2).addSuppressed(((java.lang.Throwable)v4));
    Object v5 = null;
    Object v6 = "Invalid 'any-getter' annotation on method ";
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v6),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).getGenericType();
    Object v21 = false;
    Object v22 = 10;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v21).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    ((java.lang.Throwable)v2).printStackTrace();
    Object v3 = null;
    Object v4 = "";
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = true;
    Object v8 = "string";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),(((java.lang.Boolean)v7).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v4),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).toString();
    Object v4 = "\": ";
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = true;
    Object v8 = "string";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),(((java.lang.Boolean)v7).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v4),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v22).isConcrete();
    Object v24 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "declaringClass";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "Internal error: should never end up through rthis code path";
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Cannot create TypeBindings for class ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).isPublic();
    Object v14 = 10;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "\"";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "NUM";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).getRawType();
    Object v14 = 10;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = new java.lang.Class[]{null,null};
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20).hasOneOf(((java.lang.Class[])v21));
    Object v23 = 10;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = -43;
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v24).containedTypeOrUnknown((((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = 10;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = java.util.List.of(((java.lang.Object)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).equals(((java.lang.Object)v20));
    Object v22 = true;
    Object v23 = 10;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v22).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = "Missing constructor (broken JDK (de)serialization?)";
    Object v5 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = true;
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isInterface();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v22).isInterface();
    Object v24 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = 10;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v14).findSuperType(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "is";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "getMetaCla!s";
    Object v4 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = 10;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).hasAnnotation(((java.lang.Class)v22));
    Object v24 = false;
    Object v25 = 10;
    Object v26 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v24).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ",";
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "items";
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "stgring";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ": ";
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "H";
    Object v4 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "STRING";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v6),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ")";
    Object v4 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "J";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "ar6ray";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).hashCode();
    Object v21 = true;
    Object v22 = 10;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v21).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = ((java.lang.Throwable)v2).toString();
    Object v4 = "nSll";
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v4),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "DYNAMIC";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "] that wasn't previously seen as unresolved.";
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "'";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).equals(((java.lang.Object)v12));
    Object v14 = false;
    Object v15 = 10;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.core.type.ResolvedType)v16).isReferenceType();
    Object v18 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 10;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = 10;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = 10;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v22).isTypeOrSubTypeOf(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v1));
    Object v3 = "s";
    Object v4 = "array";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v2),((java.lang.String)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 10;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{[null],null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = 10;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = 10;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
