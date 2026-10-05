package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
    Object v2 = ((com.fasterxml.jackson.databind.SerializationConfig)v0).with(((com.fasterxml.jackson.databind.SerializationFeature)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).constructDefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v26).introspectDirectClassAnnotations(((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = 0;
    Object v30 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v26).hasMapperFeatures((((java.lang.Integer)v29).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).getDefaultPropertyInclusion();
    Object v26 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v27 = ((java.lang.Enum)v26).hashCode();
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v26));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v25).getGenericSignature();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).findRootName(((com.fasterxml.jackson.databind.JavaType)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.core.FormatFeature[]{null,null,null};
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).withoutFeatures(((com.fasterxml.jackson.core.FormatFeature[])v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS;
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).without(((com.fasterxml.jackson.databind.SerializationFeature)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v26).getPropertyNamingStrategy();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).getRootName();
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).getSerializationInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).withoutAttribute(((java.lang.Object)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).findRootName(((com.fasterxml.jackson.databind.JavaType)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v25),((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).withFeatures(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).getAnnotationIntrospector();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).useRootWrapping();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).useRootWrapping();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).shouldSortPropertiesAlphabetically();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.cfg.MapperConfig.collectFeatureDefaults(((java.lang.Class)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v25),((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v29));
    Object v31 = new com.fasterxml.jackson.databind.SerializationFeature[]{null};
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).withoutFeatures(((com.fasterxml.jackson.databind.SerializationFeature[])v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = 38;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).hasSerializationFeatures((((java.lang.Integer)v25).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).getDefaultPropertyFormat(((java.lang.Class)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS;
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).without(((com.fasterxml.jackson.databind.SerializationFeature)v27));
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).useRootWrapping();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.MapperFeature[]{null,null};
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.databind.MapperFeature[])v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v26).getDefaultPropertyInclusion(((java.lang.Class)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v30).getInterfaces();
    Object v32 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v26).findRootName(((com.fasterxml.jackson.databind.JavaType)v30));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v31 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v25),((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v29));
    Object v31 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION;
    Object v32 = false;
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.MapperFeature)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.SerializationFeature[]{null,null,null};
    Object v35 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).withoutFeatures(((com.fasterxml.jackson.databind.SerializationFeature[])v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).introspectDirectClassAnnotations(((com.fasterxml.jackson.databind.JavaType)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v25),((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v29));
    Object v31 = com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).isEnabled(((com.fasterxml.jackson.databind.SerializationFeature)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v29));
    Object v31 = com.fasterxml.jackson.databind.SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).without(((com.fasterxml.jackson.databind.SerializationFeature)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v26 = new com.fasterxml.jackson.databind.SerializationFeature[]{null,null,null};
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.databind.SerializationFeature)v25),((com.fasterxml.jackson.databind.SerializationFeature[])v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).getDefaultPropertyInclusion();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).getTimeZone();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).useRootWrapping();
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v31));
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.type.TypeFactory)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v31));
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.type.TypeFactory)v34));
    Object v36 = "array";
    Object v37 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v35).withRootName(((java.lang.String)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v28).findRootName(((java.lang.Class)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).withoutAttribute(((java.lang.Object)v25));
    Object v27 = 14;
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v26).hasMapperFeatures((((java.lang.Integer)v27).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).getDefaultPropertyInclusion();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.MapperFeature[]{null};
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.databind.MapperFeature[])v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v26 = ((java.lang.Enum)v25).getDeclaringClass();
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = "";
    Object v3 = ((java.lang.Class)v1).getResource(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.cfg.MapperConfig.collectFeatureDefaults(((java.lang.Class)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v31));
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.type.TypeFactory)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.SerializationConfig)v35).introspect(((com.fasterxml.jackson.databind.JavaType)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "";
    Object v31 = java.util.TimeZone.getTimeZone(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((java.util.TimeZone)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v26 = ((java.lang.Enum)v25).getDeclaringClass();
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v28 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v27).withoutFeatures(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v31));
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.type.TypeFactory)v34));
    Object v36 = ((com.fasterxml.jackson.databind.SerializationConfig)v35).getSerializationInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "";
    Object v31 = java.util.TimeZone.getTimeZone(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((java.util.TimeZone)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v34 = ((com.fasterxml.jackson.databind.SerializationConfig)v32).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v31 = false;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((com.fasterxml.jackson.databind.MapperFeature)v30),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v26 = ((java.lang.Enum)v25).getDeclaringClass();
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v28 = new com.fasterxml.jackson.databind.SerializationFeature[]{null};
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v27).withFeatures(((com.fasterxml.jackson.databind.SerializationFeature[])v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
    Object v31 = new com.fasterxml.jackson.databind.SerializationFeature[]{null,null,null};
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((com.fasterxml.jackson.databind.SerializationFeature)v30),((com.fasterxml.jackson.databind.SerializationFeature[])v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v29));
    Object v31 = com.fasterxml.jackson.databind.SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).without(((com.fasterxml.jackson.databind.SerializationFeature)v31));
    Object v33 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v34 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v35 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v33).getAttribute(((java.lang.Object)v34));
    Object v36 = ((com.fasterxml.jackson.databind.SerializationConfig)v32).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v33));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v29));
    Object v31 = com.fasterxml.jackson.databind.SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).without(((com.fasterxml.jackson.databind.SerializationFeature)v31));
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v32).getDefaultVisibilityChecker();
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).getSerializationInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v29));
    Object v31 = com.fasterxml.jackson.databind.SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).without(((com.fasterxml.jackson.databind.SerializationFeature)v31));
    Object v33 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v34 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v35 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v33).getAttribute(((java.lang.Object)v34));
    Object v36 = ((com.fasterxml.jackson.databind.SerializationConfig)v32).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v33));
    Object v37 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v38 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v36).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v37));
    Object v39 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v36).getRootName();
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = "number";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((java.util.Locale)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.core.FormatFeature[]{null};
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v31));
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.type.TypeFactory)v34));
    Object v36 = "array";
    Object v37 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v35).withRootName(((java.lang.String)v36));
    Object v38 = new com.fasterxml.jackson.databind.MapperFeature[]{null};
    Object v39 = ((com.fasterxml.jackson.databind.SerializationConfig)v37).with(((com.fasterxml.jackson.databind.MapperFeature[])v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.AnnotationIntrospector)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = java.text.DateFormat.getTimeInstance();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).with(((java.text.DateFormat)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "";
    Object v31 = java.util.TimeZone.getTimeZone(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((java.util.TimeZone)v31));
    Object v33 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v34 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v32).withoutAttribute(((java.lang.Object)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "";
    Object v31 = java.util.TimeZone.getTimeZone(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((java.util.TimeZone)v31));
    Object v33 = -2;
    Object v34 = ((com.fasterxml.jackson.databind.SerializationConfig)v32).hasSerializationFeatures((((java.lang.Integer)v33).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v32 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v30).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "";
    Object v31 = java.util.TimeZone.getTimeZone(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((java.util.TimeZone)v31));
    Object v33 = new java.util.TreeMap();
    Object v34 = new java.util.TreeMap();
    ((java.util.Map)v33).putAll(((java.util.Map)v34));
    Object v35 = null;
    Object v36 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v32).withAttributes(((java.util.Map)v33));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = 1;
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v24).hasMapperFeatures((((java.lang.Integer)v25).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v26 = ((java.lang.Enum)v25).getDeclaringClass();
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v27).introspectClassAnnotations(((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v27).getLocale();
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).withoutAttribute(((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v26).findRootName(((java.lang.Class)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v26 = ((java.lang.Enum)v25).getDeclaringClass();
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v28 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v27).withoutFeatures(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v28));
    Object v30 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v29).getClassIntrospector();
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).withView(((java.lang.Class)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).withView(((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v27).getDefaultVisibilityChecker();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v25));
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v27));
    Object v29 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v30 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.SerializationConfig)v26),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v28),((com.fasterxml.jackson.databind.util.RootNameLookup)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "";
    Object v31 = java.util.TimeZone.getTimeZone(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((java.util.TimeZone)v31));
    Object v33 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v34 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v32).withoutAttribute(((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v36 = ((com.fasterxml.jackson.databind.SerializationConfig)v34).withFilters(((com.fasterxml.jackson.databind.ser.FilterProvider)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "";
    Object v31 = java.util.TimeZone.getTimeZone(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((java.util.TimeZone)v31));
    Object v33 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
    Object v34 = new com.fasterxml.jackson.databind.SerializationFeature[]{null,null};
    Object v35 = ((com.fasterxml.jackson.databind.SerializationConfig)v32).with(((com.fasterxml.jackson.databind.SerializationFeature)v33),((com.fasterxml.jackson.databind.SerializationFeature[])v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = "Could not resolve tye id '";
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).withRootName(((java.lang.String)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v26 = ((java.lang.Enum)v25).getDeclaringClass();
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v28 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v27).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = "Could not resolve tye id '";
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).withRootName(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v28 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v27));
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.AnnotationIntrospector)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).constructDefaultPrettyPrinter();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).getDefaultVisibilityChecker();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = "Could not resolve tye id '";
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).withRootName(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v26).getBase64Variant();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).withView(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v27).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v27).getAnnotationIntrospector();
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.SerializationConfig)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v29).getActiveView();
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.AnnotationIntrospector)v25));
    Object v27 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v28 = ((java.lang.Enum)v27).hashCode();
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.SerializationFeature)v27));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v31));
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.type.TypeFactory)v34));
    Object v36 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v37 = ((com.fasterxml.jackson.databind.SerializationConfig)v35).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v30).copy();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = "Could not resolve tye id '";
    Object v26 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).withRootName(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v28 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v27));
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v28));
    Object v30 = new com.fasterxml.jackson.core.FormatFeature[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = "";
    Object v31 = java.util.TimeZone.getTimeZone(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).with(((java.util.TimeZone)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v34 = ((com.fasterxml.jackson.databind.SerializationConfig)v32).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v33));
    Object v35 = java.text.DateFormat.getTimeInstance();
    Object v36 = ((com.fasterxml.jackson.databind.SerializationConfig)v34).with(((java.text.DateFormat)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = java.text.DateFormat.getTimeInstance();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).with(((java.text.DateFormat)v29));
    Object v31 = java.text.DateFormat.getTimeInstance();
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((java.text.DateFormat)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).isEnabled(((com.fasterxml.jackson.databind.SerializationFeature)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v25));
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v27));
    Object v29 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v30 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.SerializationConfig)v26),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v28),((com.fasterxml.jackson.databind.util.RootNameLookup)v29));
    Object v31 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_WITH_ZONE_ID;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.databind.SerializationFeature)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = java.text.DateFormat.getTimeInstance();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).with(((java.text.DateFormat)v29));
    Object v31 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v26 = ((java.lang.Enum)v25).getDeclaringClass();
    Object v27 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v28 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v27).withoutFeatures(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).withInsertedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v27));
    Object v31 = new com.fasterxml.jackson.databind.SerializationFeature[]{null,null,null};
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).withFeatures(((com.fasterxml.jackson.databind.SerializationFeature[])v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).with(((com.fasterxml.jackson.databind.AnnotationIntrospector)v29));
    Object v31 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{null};
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).withoutFeatures(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v28 = ((com.fasterxml.jackson.databind.SerializationConfig)v26).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v27));
    Object v29 = java.text.DateFormat.getTimeInstance();
    Object v30 = ((com.fasterxml.jackson.databind.SerializationConfig)v28).with(((java.text.DateFormat)v29));
    Object v31 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v32 = ((com.fasterxml.jackson.databind.SerializationConfig)v30).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v31));
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v32).getAnnotationIntrospector();
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v6 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v7 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v4),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v5),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v10));
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "number";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).introspect(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.SerializationConfig)v24).with(((com.fasterxml.jackson.databind.MapperFeature)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v31 = ((com.fasterxml.jackson.databind.SerializationConfig)v29).withPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v30));
    Object v32 = new com.fasterxml.jackson.databind.MapperFeature[]{null,null,null};
    Object v33 = ((com.fasterxml.jackson.databind.SerializationConfig)v31).with(((com.fasterxml.jackson.databind.MapperFeature[])v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
