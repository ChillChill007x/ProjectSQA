package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.cfg.MapperConfig.collectFeatureDefaults(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationConfig)v0).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getSimpleName();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v0).constructType(((java.lang.Class)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v0).getRootName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.core.FormatFeature[]{null};
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).withoutFeatures(((com.fasterxml.jackson.core.FormatFeature[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).findRootName(((com.fasterxml.jackson.databind.JavaType)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).without(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).without(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).getDefaultPropertyInclusion(((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).mixInCount();
    Object v8 = 0;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).withAttributes(((java.util.Map)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
    Object v11 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null,null};
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10),((com.fasterxml.jackson.databind.DeserializationFeature[])v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_IS_GETTERS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).mixInCount();
    Object v8 = 0;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).withAttributes(((java.util.Map)v9));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v12 = new com.fasterxml.jackson.core.JsonFactory();
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v10).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v11),((com.fasterxml.jackson.core.JsonFactory)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STD_BEAN_NAMING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).mixInCount();
    Object v8 = 0;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).withAttributes(((java.util.Map)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v10).with(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = 0;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v9).withAttributes(((java.util.Map)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).getAnnotationIntrospector();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STD_BEAN_NAMING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v9).findRootName(((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).mixInCount();
    Object v8 = 0;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v6).withAttributes(((java.util.Map)v9));
    Object v11 = com.fasterxml.jackson.databind.DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
    Object v12 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null,null};
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v10).with(((com.fasterxml.jackson.databind.DeserializationFeature)v11),((com.fasterxml.jackson.databind.DeserializationFeature[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).without(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v6).typeResolverBuilderInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v19),((java.lang.Class)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STD_BEAN_NAMING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v9).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v9).typeIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v22),((java.lang.Class)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v11 = 0;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v10).withSharedAttributes(((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STD_BEAN_NAMING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
    Object v13 = ((com.fasterxml.jackson.core.JsonFactory)v11).disable(((com.fasterxml.jackson.core.JsonFactory.Feature)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v10),((com.fasterxml.jackson.core.JsonFactory)v11));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STD_BEAN_NAMING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES;
    Object v11 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null,null};
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10),((com.fasterxml.jackson.databind.DeserializationFeature[])v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).without(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).without(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).without(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v14).findRootName(((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v16).isLocalClass();
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).withView(((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null,null};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
    Object v16 = ((java.lang.Enum)v15).hashCode();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.databind.DeserializationFeature)v15),((com.fasterxml.jackson.databind.DeserializationFeature[])v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v16).isLocalClass();
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).withView(((java.lang.Class)v16));
    Object v19 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null,null};
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).withoutFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v9).findRootName(((java.lang.Class)v14));
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
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STD_BEAN_NAMING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.FormatFeature[]{null};
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).withoutFeatures(((com.fasterxml.jackson.core.FormatFeature[])v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = "[anySetter]";
    Object v16 = "*]";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = ((com.fasterxml.jackson.databind.PropertyName)v17).equals(((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).withRootName(((com.fasterxml.jackson.databind.PropertyName)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v15).findTypeParameters(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).introspectForBuilder(((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 7.20272448149376D;
    Object v11 = new com.fasterxml.jackson.databind.node.DoubleNode((((java.lang.Double)v10).doubleValue()));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    ((com.fasterxml.jackson.databind.DeserializationConfig)v9).initialize(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v16).isLocalClass();
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).withView(((java.lang.Class)v16));
    Object v19 = com.fasterxml.jackson.databind.MapperFeature.REQUIRE_SETTERS_FOR_GETTERS;
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).with(((com.fasterxml.jackson.databind.MapperFeature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.MapperFeature[]{null,null};
    Object v23 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).with(((com.fasterxml.jackson.databind.MapperFeature[])v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).withNoProblemHandlers();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
    Object v16 = ((java.lang.Enum)v15).hashCode();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.databind.DeserializationFeature)v15),((com.fasterxml.jackson.databind.DeserializationFeature[])v17));
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).withInsertedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = "[anySetter]";
    Object v13 = "*]";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).withRootName(((com.fasterxml.jackson.databind.PropertyName)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
    Object v16 = ((java.lang.Enum)v15).hashCode();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.databind.DeserializationFeature)v15),((com.fasterxml.jackson.databind.DeserializationFeature[])v17));
    Object v19 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_INTEGER_FOR_INTS;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).without(((com.fasterxml.jackson.databind.DeserializationFeature)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS;
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationConfig)v16).getBaseSettings();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).useRootWrapping();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12).getAttribute(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = -13;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v6).typeResolverBuilderInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v23),((java.lang.Class)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22));
    Object v24 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationConfig)v23).with(((com.fasterxml.jackson.databind.MapperFeature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v28 = ((com.fasterxml.jackson.databind.DeserializationConfig)v26).with(((com.fasterxml.jackson.databind.DeserializationFeature)v27));
    Object v29 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS;
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationConfig)v28).with(((com.fasterxml.jackson.databind.DeserializationFeature)v29));
    Object v31 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v16).withoutAttribute(((java.lang.Object)v30));
    Object v32 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v33 = ((com.fasterxml.jackson.databind.DeserializationConfig)v16).without(((com.fasterxml.jackson.core.JsonParser.Feature)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = "[anySetter]";
    Object v16 = "*]";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = ((com.fasterxml.jackson.databind.PropertyName)v17).equals(((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).withRootName(((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v21 = 1;
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationConfig)v20).hasDeserializationFeatures((((java.lang.Integer)v21).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
    Object v16 = ((java.lang.Enum)v15).hashCode();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.databind.DeserializationFeature)v15),((com.fasterxml.jackson.databind.DeserializationFeature[])v17));
    Object v19 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_INTEGER_FOR_INTS;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).without(((com.fasterxml.jackson.databind.DeserializationFeature)v19));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = ((com.fasterxml.jackson.databind.DeserializationConfig)v21).with(((com.fasterxml.jackson.databind.AnnotationIntrospector)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12).getAttribute(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationConfig)v17).introspectClassAnnotations(((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null};
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).withFeatures(((com.fasterxml.jackson.databind.DeserializationFeature[])v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationConfig)v16).withView(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v24 = ((java.lang.Enum)v23).getDeclaringClass();
    Object v25 = new com.fasterxml.jackson.core.JsonFactory();
    Object v26 = ((com.fasterxml.jackson.core.JsonFactory)v25).getRootValueSeparator();
    Object v27 = ((com.fasterxml.jackson.databind.DeserializationConfig)v16).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v23),((com.fasterxml.jackson.core.JsonFactory)v25));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).withNoProblemHandlers();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = -13;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v10).typeResolverBuilderInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v27),((java.lang.Class)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).without(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v14).getPropertyNamingStrategy();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12).getAttribute(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12));
    Object v18 = 0;
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationConfig)v17).hasDeserializationFeatures((((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v18 = new com.fasterxml.jackson.core.JsonFactory();
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationConfig)v16).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v17),((com.fasterxml.jackson.core.JsonFactory)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12).getAttribute(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12));
    Object v18 = java.text.DateFormat.getDateInstance();
    Object v19 = ((java.text.DateFormat)v18).clone();
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationConfig)v17).with(((java.text.DateFormat)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STD_BEAN_NAMING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null};
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).without(((com.fasterxml.jackson.databind.DeserializationFeature)v10),((com.fasterxml.jackson.databind.DeserializationFeature[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null};
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v11 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null};
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10),((com.fasterxml.jackson.databind.DeserializationFeature[])v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.MapperFeature[]{null};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v8).without(((com.fasterxml.jackson.databind.MapperFeature[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v8).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).getGenericSignature();
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).introspectClassAnnotations(((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_IS_GETTERS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.PROPAGATE_TRANSIENT_MARKER;
    Object v11 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS;
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationConfig)v13).with(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
    Object v16 = ((java.lang.Enum)v15).hashCode();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.databind.DeserializationFeature)v15),((com.fasterxml.jackson.databind.DeserializationFeature[])v17));
    Object v19 = "[anySetter]";
    Object v20 = "*]";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).withRootName(((com.fasterxml.jackson.databind.PropertyName)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v10).withPerCallAttribute(((java.lang.Object)v11),((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v10));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_SETTERS;
    Object v8 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v6).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v11).getDefaultPropertyInclusion();
    Object v13 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v11).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12).getAttribute(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).isAnnotation();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v17).introspectClassAnnotations(((java.lang.Class)v22));
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
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7));
    Object v9 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v8).copy();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_IS_GETTERS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v9).getRootName();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = 7.20272448149376D;
    Object v8 = new com.fasterxml.jackson.databind.node.DoubleNode((((java.lang.Double)v7).doubleValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    ((com.fasterxml.jackson.databind.DeserializationConfig)v6).initialize(((com.fasterxml.jackson.core.JsonParser)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).withNoProblemHandlers();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v10).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
    Object v16 = ((java.lang.Enum)v15).hashCode();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.databind.DeserializationFeature)v15),((com.fasterxml.jackson.databind.DeserializationFeature[])v17));
    Object v19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v20 = ((java.lang.Enum)v19).getDeclaringClass();
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).without(((com.fasterxml.jackson.core.JsonParser.Feature)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = "[anySetter]";
    Object v16 = "*]";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = ((com.fasterxml.jackson.databind.PropertyName)v17).equals(((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).withRootName(((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v21 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v20).mixInCount();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v20).findRootName(((java.lang.Class)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS;
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationConfig)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v17 = new com.fasterxml.jackson.core.JsonFactory();
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v13).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v16),((com.fasterxml.jackson.core.JsonFactory)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v16).getRootName();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = "[anySetter]";
    Object v16 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v14).withRootName(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.core.FormatFeature[]{null,null};
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).withoutFeatures(((com.fasterxml.jackson.core.FormatFeature[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = new com.fasterxml.jackson.databind.MapperFeature[]{};
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).without(((com.fasterxml.jackson.databind.MapperFeature[])v10));
    Object v12 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_INVALID_SUBTYPE;
    Object v16 = ((java.lang.Enum)v15).hashCode();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).with(((com.fasterxml.jackson.databind.DeserializationFeature)v15),((com.fasterxml.jackson.databind.DeserializationFeature[])v17));
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationConfig)v18).getDefaultPropertyInclusion();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationConfig)v16).withNoProblemHandlers();
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v16).withNoProblemHandlers();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationConfig)v14).getDefaultVisibilityChecker();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).withNoProblemHandlers();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v10).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11));
    Object v13 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null,null};
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v12).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).withNoProblemHandlers();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = new com.fasterxml.jackson.databind.MapperFeature[]{};
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).without(((com.fasterxml.jackson.databind.MapperFeature[])v10));
    Object v12 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12));
    Object v14 = "smring";
    Object v15 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v13).compileString(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = new com.fasterxml.jackson.databind.MapperFeature[]{};
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).without(((com.fasterxml.jackson.databind.MapperFeature[])v10));
    Object v12 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v13).withView(((java.lang.Class)v18));
    Object v20 = "A";
    Object v21 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v13).withRootName(((java.lang.String)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory();
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v14),((com.fasterxml.jackson.core.JsonFactory)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v6).withNoProblemHandlers();
    Object v8 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v9 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.DeserializationFeature)v8),((com.fasterxml.jackson.databind.DeserializationFeature[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
