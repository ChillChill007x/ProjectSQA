package com.fasterxml.jackson.databind.deser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v7 = java.text.DateFormat.getDateInstance();
    Object v8 = null;
    Object v9 = "PHONE";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v6),((java.text.DateFormat)v7),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v8),((java.util.Locale)v10),((java.util.TimeZone)v11),((com.fasterxml.jackson.core.Base64Variant)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v29),((java.lang.reflect.Constructor)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).isPotentialBeanType(((java.lang.Class)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v13 = java.text.DateFormat.getDateInstance();
    Object v14 = null;
    Object v15 = "PHONE";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v12),((java.text.DateFormat)v13),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v14),((java.util.Locale)v16),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v26),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v11 = java.text.DateFormat.getDateInstance();
    Object v12 = null;
    Object v13 = "PHONE";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v11),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v12),((java.util.Locale)v14),((java.util.TimeZone)v15),((com.fasterxml.jackson.core.Base64Variant)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v31),((java.lang.reflect.Constructor)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v36),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v11 = java.text.DateFormat.getDateInstance();
    Object v12 = null;
    Object v13 = "PHONE";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v11),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v12),((java.util.Locale)v14),((java.util.TimeZone)v15),((com.fasterxml.jackson.core.Base64Variant)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v31),((java.lang.reflect.Constructor)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v36),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).getFactoryConfig();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).getFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType[])v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).materializeAbstractType(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.BeanDescription)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v9 = java.text.DateFormat.getDateInstance();
    Object v10 = null;
    Object v11 = "PHONE";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v9),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v10),((java.util.Locale)v12),((java.util.TimeZone)v13),((com.fasterxml.jackson.core.Base64Variant)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v29),((java.lang.reflect.Constructor)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v9 = java.text.DateFormat.getDateInstance();
    Object v10 = null;
    Object v11 = "PHONE";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v9),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v10),((java.util.Locale)v12),((java.util.TimeZone)v13),((com.fasterxml.jackson.core.Base64Variant)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JavaType)v25).withTypeHandler(((java.lang.Object)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((com.fasterxml.jackson.databind.JavaType)v25));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).buildThrowableDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.BeanDescription)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = "z";
    Object v23 = "]";
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v20).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = -17;
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v27).containedType((((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v20),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v8 = java.text.DateFormat.getDateInstance();
    Object v9 = null;
    Object v10 = "PHONE";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v7),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v11),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).getFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).isPotentialBeanType(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).findStdDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.BeanDescription)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v11 = java.text.DateFormat.getDateInstance();
    Object v12 = null;
    Object v13 = "PHONE";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v11),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v12),((java.util.Locale)v14),((java.util.TimeZone)v15),((com.fasterxml.jackson.core.Base64Variant)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v31),((java.lang.reflect.Constructor)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v36),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findValueInstantiator(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.BeanDescription)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).isPotentialBeanType(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v19),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType[])v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType[])v13),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).buildThrowableDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.BeanDescription)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).getFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).isPotentialBeanType(((java.lang.Class)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v11 = java.text.DateFormat.getDateInstance();
    Object v12 = null;
    Object v13 = "PHONE";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v11),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v12),((java.util.Locale)v14),((java.util.TimeZone)v15),((com.fasterxml.jackson.core.Base64Variant)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v24).getDefaultVisibilityChecker();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v24),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).getInterfaces();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v15 = java.text.DateFormat.getDateInstance();
    Object v16 = null;
    Object v17 = "PHONE";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v14),((java.text.DateFormat)v15),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v16),((java.util.Locale)v18),((java.util.TimeZone)v19),((com.fasterxml.jackson.core.Base64Variant)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v28),((com.fasterxml.jackson.databind.JavaType)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).getFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = java.text.DateFormat.getDateInstance();
    Object v22 = null;
    Object v23 = "PHONE";
    Object v24 = new java.util.Locale(((java.lang.String)v23));
    Object v25 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v16),((com.fasterxml.jackson.databind.AnnotationIntrospector)v17),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20),((java.text.DateFormat)v21),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v22),((java.util.Locale)v24),((java.util.TimeZone)v25),((com.fasterxml.jackson.core.Base64Variant)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v30));
    Object v32 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v33 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v34 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v27),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v28),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v31),((com.fasterxml.jackson.databind.util.RootNameLookup)v32),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v35),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v34),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v9 = java.text.DateFormat.getDateInstance();
    Object v10 = null;
    Object v11 = "PHONE";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v9),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v10),((java.util.Locale)v12),((java.util.TimeZone)v13),((com.fasterxml.jackson.core.Base64Variant)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v28),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.JavaType[])v32),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = null;
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createTreeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((com.fasterxml.jackson.databind.JavaType)v34),((com.fasterxml.jackson.databind.BeanDescription)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).isPotentialBeanType(((java.lang.Class)v38));
    org.junit.Assert.assertEquals((Object)(true), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).getFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v16 = java.text.DateFormat.getDateInstance();
    Object v17 = null;
    Object v18 = "PHONE";
    Object v19 = new java.util.Locale(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v15),((java.text.DateFormat)v16),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v17),((java.util.Locale)v19),((java.util.TimeZone)v20),((com.fasterxml.jackson.core.Base64Variant)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v29),((com.fasterxml.jackson.databind.JavaType)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).getFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).isPotentialBeanType(((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v8 = java.text.DateFormat.getDateInstance();
    Object v9 = null;
    Object v10 = "PHONE";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v7),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v11),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v23 = ((com.fasterxml.jackson.databind.DeserializationConfig)v21).without(((com.fasterxml.jackson.core.JsonParser.Feature)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).getFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).getFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = java.text.DateFormat.getDateInstance();
    Object v22 = null;
    Object v23 = "PHONE";
    Object v24 = new java.util.Locale(((java.lang.String)v23));
    Object v25 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v16),((com.fasterxml.jackson.databind.AnnotationIntrospector)v17),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20),((java.text.DateFormat)v21),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v22),((java.util.Locale)v24),((java.util.TimeZone)v25),((com.fasterxml.jackson.core.Base64Variant)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v30));
    Object v32 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v33 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v34 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v27),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v28),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v31),((com.fasterxml.jackson.databind.util.RootNameLookup)v32),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v34),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6).deserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v13 = java.text.DateFormat.getDateInstance();
    Object v14 = null;
    Object v15 = "PHONE";
    Object v16 = new java.util.Locale(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v12),((java.text.DateFormat)v13),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v14),((java.util.Locale)v16),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v7 = java.text.DateFormat.getDateInstance();
    Object v8 = null;
    Object v9 = "PHONE";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v6),((java.text.DateFormat)v7),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v8),((java.util.Locale)v10),((java.util.TimeZone)v11),((com.fasterxml.jackson.core.Base64Variant)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType[])v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v27),((java.lang.reflect.Constructor)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).getFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType[])v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v32 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v27),((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v20),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).getFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).getFactoryConfig();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = 15;
    Object v9 = new java.lang.StringBuilder((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v7).getGenericSignature(((java.lang.StringBuilder)v9));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).findStdDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.BeanDescription)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).containedTypeCount();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v10 = java.text.DateFormat.getDateInstance();
    Object v11 = null;
    Object v12 = "PHONE";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v9),((java.text.DateFormat)v10),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v11),((java.util.Locale)v13),((java.util.TimeZone)v14),((com.fasterxml.jackson.core.Base64Variant)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType[])v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((java.lang.reflect.Constructor)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).isPotentialBeanType(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findValueInstantiator(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.BeanDescription)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v11 = java.text.DateFormat.getDateInstance();
    Object v12 = null;
    Object v13 = "PHONE";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v11),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v12),((java.util.Locale)v14),((java.util.TimeZone)v15),((com.fasterxml.jackson.core.Base64Variant)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType[])v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((java.lang.reflect.Constructor)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v36));
    Object v38 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v24),((com.fasterxml.jackson.databind.introspect.Annotated)v37),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).getFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v10 = java.text.DateFormat.getDateInstance();
    Object v11 = null;
    Object v12 = "PHONE";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v9),((java.text.DateFormat)v10),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v11),((java.util.Locale)v13),((java.util.TimeZone)v14),((com.fasterxml.jackson.core.Base64Variant)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType[])v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((java.lang.reflect.Constructor)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).createMapDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.type.MapType)v12),((com.fasterxml.jackson.databind.BeanDescription)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = null;
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v6)._validateSubType(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.BeanDescription)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v8 = java.text.DateFormat.getDateInstance();
    Object v9 = null;
    Object v10 = "PHONE";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v7),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v11),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v24).forcedNarrowBy(((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v24));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = " does not define valid handledType() -- must either register with method that ta=es type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'";
    Object v9 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelega";
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).weirdKeyException(((java.lang.Class)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7).keyDeserializers();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).getFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v7 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v12 = java.text.DateFormat.getDateInstance();
    Object v13 = null;
    Object v14 = "PHONE";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v9 = java.text.DateFormat.getDateInstance();
    Object v10 = null;
    Object v11 = "PHONE";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v9),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v10),((java.util.Locale)v12),((java.util.TimeZone)v13),((com.fasterxml.jackson.core.Base64Variant)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((com.fasterxml.jackson.databind.DeserializationConfig)v22).withView(((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v15 = java.text.DateFormat.getDateInstance();
    Object v16 = null;
    Object v17 = "PHONE";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v14),((java.text.DateFormat)v15),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v16),((java.util.Locale)v18),((java.util.TimeZone)v19),((com.fasterxml.jackson.core.Base64Variant)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).getInterfaces();
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v28),((com.fasterxml.jackson.databind.JavaType)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10).keyDeserializers();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v12).getFactoryConfig();
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v13).getGenericInterfaces();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).isPotentialBeanType(((java.lang.Class)v13));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v12 = java.text.DateFormat.getDateInstance();
    Object v13 = null;
    Object v14 = "PHONE";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v8 = java.text.DateFormat.getDateInstance();
    Object v9 = null;
    Object v10 = "PHONE";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v7),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v11),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType[])v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((java.lang.reflect.Constructor)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v8 = java.text.DateFormat.getDateInstance();
    Object v9 = null;
    Object v10 = "PHONE";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v7),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v11),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = 15;
    Object v24 = new java.lang.StringBuilder((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v22).getErasedSignature(((java.lang.StringBuilder)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v31),((java.lang.reflect.Constructor)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v36),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v7 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v12 = java.text.DateFormat.getDateInstance();
    Object v13 = null;
    Object v14 = "PHONE";
    Object v15 = new java.util.Locale(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5).keyDeserializers();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).getFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v15).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v21).findStdDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.BeanDescription)v26));
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.BeanProperty)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JavaType)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).keyDeserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).getFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v8).isTypeOrSuperTypeOf(((java.lang.Class)v10));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).createBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.BeanDescription)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v9 = java.text.DateFormat.getDateInstance();
    Object v10 = null;
    Object v11 = "PHONE";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v9),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v10),((java.util.Locale)v12),((java.util.TimeZone)v13),((com.fasterxml.jackson.core.Base64Variant)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v31),((java.lang.reflect.Constructor)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v36),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).getFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).findDefaultDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.BeanDescription)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v8 = java.text.DateFormat.getDateInstance();
    Object v9 = null;
    Object v10 = "PHONE";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v7),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v11),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType[])v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v36));
    Object v38 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35).getAnnotation(((java.lang.Class)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
