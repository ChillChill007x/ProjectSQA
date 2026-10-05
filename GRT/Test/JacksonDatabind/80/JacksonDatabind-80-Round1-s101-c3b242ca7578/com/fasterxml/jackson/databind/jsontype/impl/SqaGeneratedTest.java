package com.fasterxml.jackson.databind.jsontype.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = null;
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new java.lang.Class[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = 16.362019F;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v14 = ((java.util.Map)v11).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).findConfigOverride(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v27),((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v29),((java.lang.reflect.Constructor)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v36),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = 16.362019F;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = 0;
    Object v13 = 16.362019F;
    Object v14 = new java.util.HashMap((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    ((java.util.Map)v11).putAll(((java.util.Map)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = 16.362019F;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = ((java.util.Map)v11).hashCode();
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33).getAnnotation(((java.lang.Class)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v1));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v18 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v19 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v17),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v22 = "GM";
    Object v23 = new java.util.Locale(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v21),((java.util.Locale)v23));
    Object v25 = null;
    Object v26 = "GM";
    Object v27 = new java.util.Locale(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20),((java.text.DateFormat)v24),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v25),((java.util.Locale)v27),((java.util.TimeZone)v28),((com.fasterxml.jackson.core.Base64Variant)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v32 = null;
    Object v33 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v34 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v35 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v30),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v31),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v32),((com.fasterxml.jackson.databind.util.RootNameLookup)v33),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v34));
    Object v36 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v0).collectAndResolveSubtypes(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.cfg.MapperConfig)v35),((com.fasterxml.jackson.databind.AnnotationIntrospector)v36),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getSigners();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v7 = "GM";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = 0;
    Object v13 = 16.362019F;
    Object v14 = new java.util.HashMap((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v4),((java.util.Set)v11),((java.util.Map)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v34).forcedNarrowBy(((java.lang.Class)v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Set)v8).hashCode();
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v34).getSuperClass();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v10 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v11 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v9),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v10),((java.lang.String)v11));
    Object v13 = ((java.util.Set)v8).equals(((java.lang.Object)v12));
    Object v14 = 0;
    Object v15 = 16.362019F;
    Object v16 = new java.util.HashMap((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.Annotated)v35).getName();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getClassLoader();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v5 = "GM";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v9),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = 16.362019F;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).desiredAssertionStatus();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v5 = "GM";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v9),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v16 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v17 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v15),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v20 = "GM";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v19),((java.util.Locale)v21));
    Object v23 = null;
    Object v24 = "GM";
    Object v25 = new java.util.Locale(((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v18),((java.text.DateFormat)v22),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v23),((java.util.Locale)v25),((java.util.TimeZone)v26),((com.fasterxml.jackson.core.Base64Variant)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v32 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v33 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v28),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v29),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v30),((com.fasterxml.jackson.databind.util.RootNameLookup)v31),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v32));
    Object v34 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v33).getActiveView();
    Object v35 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v36 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v35).version();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v0).collectAndResolveSubtypes(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.cfg.MapperConfig)v33),((com.fasterxml.jackson.databind.AnnotationIntrospector)v35),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = "GM";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = java.util.Set.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 0;
    Object v12 = 16.362019F;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v4),((java.util.Set)v10),((java.util.Map)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Set)v8).isEmpty();
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = "GM";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = java.util.Set.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 0;
    Object v12 = 16.362019F;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v4),((java.util.Set)v10),((java.util.Map)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = 16.362019F;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = ((java.util.Map)v11).isEmpty();
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = new java.lang.Class[]{null,null};
    Object v37 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35).hasOneOf(((java.lang.Class[])v36));
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = 16.362019F;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    ((java.util.Map)v11).clear();
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Collection)v8).parallelStream();
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getProtectionDomain();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v5 = "GM";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v9),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = ((com.fasterxml.jackson.databind.introspect.Annotated)v33).hashCode();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.jsontype.NamedType(((java.lang.Class)v5),((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v13 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v14 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v12),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = "GM";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v16),((java.util.Locale)v18));
    Object v20 = null;
    Object v21 = "GM";
    Object v22 = new java.util.Locale(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v15),((java.text.DateFormat)v19),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v20),((java.util.Locale)v22),((java.util.TimeZone)v23),((com.fasterxml.jackson.core.Base64Variant)v24));
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v29 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v30 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v25),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v26),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v27),((com.fasterxml.jackson.databind.util.RootNameLookup)v28),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v29));
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = 0;
    Object v33 = 16.362019F;
    Object v34 = new java.util.HashMap((((java.lang.Integer)v32).intValue()),(((java.lang.Float)v33).floatValue()));
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._collectAndResolve(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v3),((com.fasterxml.jackson.databind.jsontype.NamedType)v7),((com.fasterxml.jackson.databind.cfg.MapperConfig)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),((java.util.HashMap)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((java.lang.reflect.Type)v34).getTypeName();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getConstructors();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v5 = "GM";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v9),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getEnclosingClass();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v5 = "GM";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v9),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).getDefaultPropertyInclusion(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v27),((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v29),((java.lang.reflect.Constructor)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v36),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = "GM";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = java.util.Set.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 0;
    Object v12 = 16.362019F;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v4),((java.util.Set)v10),((java.util.Map)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Set)v8).toArray();
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = "GM";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = java.util.Set.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 0;
    Object v12 = 16.362019F;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = ((java.util.Map)v13).remove(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v4),((java.util.Set)v10),((java.util.Map)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = new java.lang.Class[]{null};
    Object v35 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33).hasOneOf(((java.lang.Class[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v34).withStaticTyping();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33).hasAnnotation(((java.lang.Class)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.JavaType)v37).isEnumType();
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = 16.362019F;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = ((java.util.Map)v11).equals(((java.lang.Object)v12));
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = "GM";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((java.util.Set)v8).size();
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v8),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v34).containedTypeCount();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.JavaType)v36).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.jsontype.NamedType(((java.lang.Class)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v12 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v10),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v15 = "GM";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v14),((java.util.Locale)v16));
    Object v18 = null;
    Object v19 = "GM";
    Object v20 = new java.util.Locale(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v13),((java.text.DateFormat)v17),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v18),((java.util.Locale)v20),((java.util.TimeZone)v21),((com.fasterxml.jackson.core.Base64Variant)v22));
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v30 = "GM";
    Object v31 = new java.util.Locale(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v33 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v34 = java.util.Set.of(((java.lang.Object)v29),((java.lang.Object)v31),((java.lang.Object)v32),((java.lang.Object)v33));
    Object v35 = 0;
    Object v36 = 16.362019F;
    Object v37 = new java.util.HashMap((((java.lang.Integer)v35).intValue()),(((java.lang.Float)v36).floatValue()));
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._collectAndResolveByTypeId(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((com.fasterxml.jackson.databind.jsontype.NamedType)v5),((com.fasterxml.jackson.databind.cfg.MapperConfig)v28),((java.util.Set)v34),((java.util.Map)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.jsontype.NamedType(((java.lang.Class)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v12 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v10),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v15 = "GM";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v14),((java.util.Locale)v16));
    Object v18 = null;
    Object v19 = "GM";
    Object v20 = new java.util.Locale(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v13),((java.text.DateFormat)v17),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v18),((java.util.Locale)v20),((java.util.TimeZone)v21),((com.fasterxml.jackson.core.Base64Variant)v22));
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v28).getSubtypeResolver();
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = 0;
    Object v32 = 16.362019F;
    Object v33 = new java.util.HashMap((((java.lang.Integer)v31).intValue()),(((java.lang.Float)v32).floatValue()));
    Object v34 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v35 = ((java.util.HashMap)v33).remove(((java.lang.Object)v34));
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._collectAndResolve(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((com.fasterxml.jackson.databind.jsontype.NamedType)v5),((com.fasterxml.jackson.databind.cfg.MapperConfig)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v30),((java.util.HashMap)v33));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v16 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v17 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v15),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v20 = "GM";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v19),((java.util.Locale)v21));
    Object v23 = null;
    Object v24 = "GM";
    Object v25 = new java.util.Locale(((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v18),((java.text.DateFormat)v22),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v23),((java.util.Locale)v25),((java.util.TimeZone)v26),((com.fasterxml.jackson.core.Base64Variant)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v32 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v33 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v28),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v29),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v30),((com.fasterxml.jackson.databind.util.RootNameLookup)v31),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v32));
    Object v34 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v0).collectAndResolveSubtypes(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.cfg.MapperConfig)v33),((com.fasterxml.jackson.databind.AnnotationIntrospector)v34),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v36).isPrimitive();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredMethods();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v5 = "GM";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((java.util.Map)v12).replace(((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v9),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getGenericSuperclass();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v5 = "GM";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 16.362019F;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((java.util.Map)v12).hashCode();
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v2),((java.util.Set)v9),((java.util.Map)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).getDefaultPropertyInclusion();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v27),((java.lang.reflect.Constructor)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v33));
    Object v35 = ((com.fasterxml.jackson.databind.introspect.Annotated)v34).getType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((java.lang.Class[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).getConfigOverride(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v27),((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v29),((java.lang.reflect.Constructor)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v36),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33).getDeclaringClass();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).getDefaultPropertyInclusion();
    Object v25 = null;
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).useRootWrapping();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v27),((java.lang.reflect.Constructor)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v33));
    Object v35 = ((com.fasterxml.jackson.databind.introspect.Annotated)v34).hashCode();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).getDefaultVisibilityChecker();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v27),((java.lang.reflect.Constructor)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33).getAnnotation(((java.lang.Class)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).getDefaultPropertyFormat(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v27),((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v29),((java.lang.reflect.Constructor)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v36),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = "GM";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = java.util.Set.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 0;
    Object v12 = 16.362019F;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v15 = "GM";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = java.util.function.Function.identity();
    Object v21 = ((java.util.Map)v13).computeIfAbsent(((java.lang.Object)v19),((java.util.function.Function)v20));
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v4),((java.util.Set)v10),((java.util.Map)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v9 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = "GM";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13));
    Object v15 = null;
    Object v16 = "GM";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v25).getAttributes();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v27),((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v29),((java.lang.reflect.Constructor)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v36),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.core.type.ResolvedType)v34).toCanonical();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = null;
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null,null};
    ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v1));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = "GM";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = java.util.Set.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 0;
    Object v12 = 16.362019F;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0)._combineNamedAndUnnamed(((java.lang.Class)v4),((java.util.Set)v10),((java.util.Map)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).getDefaultVisibilityChecker();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v27),((java.lang.reflect.Constructor)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v7 = "no int/Int-argument constructor/factory method to deserialize from Number va";
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = "GM";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = null;
    Object v14 = "GM";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v23).useRootWrapping();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v27),((java.lang.reflect.Constructor)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver)v0).collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
