package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).canCreateFromString();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).canCreateFromInt();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = null;
    Object v12 = "DEFAULT_TYPING";
    Object v13 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[]{null,null};
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).configureFromArraySettings(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.deser.SettableBeanProperty[])v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = java.util.TimeZone.getDefault();
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v21),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).canCreateUsingDelegate();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = 0L;
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v13),(((java.lang.Long)v14).longValue()));
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
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "DEFAULT_TYPING";
    Object v15 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = ",ignore=";
    Object v21 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).instantiationException(((java.lang.Class)v17),((java.lang.Throwable)v21));
    Object v23 = 0L;
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v13),(((java.lang.Long)v23).longValue()));
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
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v13),((java.lang.Object[])v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).canInstantiate();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = ",ignore=";
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).wrapException(((java.lang.Throwable)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = 83L;
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v16),(((java.lang.Long)v17).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).configureIncompleteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = null;
    Object v17 = "DEFAULT_TYPING";
    Object v18 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = "itemsi";
    Object v22 = "DEFAULT_TYPING";
    Object v23 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.Class)v20),((java.lang.String)v21),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18));
    Object v20 = ")";
    Object v21 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationConfig)v19).withRootName(((com.fasterxml.jackson.databind.PropertyName)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).getDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v19));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).canCreateFromBoolean();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).canCreateUsingArrayDelegate();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = "DEFAULT_TYPING";
    Object v19 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v24 = "DEFAULT_TYPING";
    Object v25 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v24));
    Object v26 = "DEFAULT_TYPING";
    Object v27 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v31 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v25),((java.lang.Object)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v15),((java.util.Map)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32));
    Object v34 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    Object v35 = "java.rmi.server.UnicastRemoteObject";
    Object v36 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.core.JsonToken)v34),((java.lang.String)v35));
    Object v37 = true;
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v13),(((java.lang.Boolean)v37).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = 1;
    Object v18 = "DEFAULT_TYPING";
    Object v19 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = "=";
    Object v23 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).weirdNumberException(((java.lang.Number)v17),((java.lang.Class)v21),((java.lang.String)v22));
    Object v24 = new java.lang.Object[]{null,null};
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object[])v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).canCreateUsingArrayDelegate();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).getValueClass();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateFromObjectWith();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = ",ignore=";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Throwable)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).canCreateFromObjectWith();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "DEFAULT_TYPING";
    Object v15 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = "UdNKNOWN";
    Object v20 = "DEFAULT_TYPING";
    Object v21 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = 1L;
    Object v25 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer(((java.lang.Class)v23),((java.lang.Long)v24));
    ((com.fasterxml.jackson.databind.DeserializationContext)v13).reportUnknownProperty(((java.lang.Object)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v25));
    Object v26 = null;
    Object v27 = 1;
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v13),(((java.lang.Integer)v27).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateFromDouble();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "DEFAULT_TYPING";
    Object v15 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = ", contains ";
    Object v20 = "Invalid Object Id definition Ror ";
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v13),(((java.lang.Boolean)v22).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateUsingDelegate();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateFromInt();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = 0;
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v14),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).getWithArgsCreator();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = new java.lang.Object[]{null,null,null};
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v13),((java.lang.Object[])v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = 0L;
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v16),(((java.lang.Long)v17).longValue()));
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
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "DEFAULT_TYPING";
    Object v16 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "DEFAULT_TYPING";
    Object v21 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v14).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateFromLong();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).canCreateFromLong();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canInstantiate();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "INFE";
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    ((com.fasterxml.jackson.databind.DeserializationContext)v14).checkUnresolvedObjectId();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = ",ignore=";
    Object v19 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Throwable)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = ",ignore=";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.String)v17));
    Object v19 = ((java.lang.Throwable)v18).fillInStackTrace();
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).unwrapAndWrapException(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Throwable)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).configureFromStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = "DEFAULT_TYPING";
    Object v18 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = ",ignore=";
    Object v20 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Throwable)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = ",ignore=";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.String)v17));
    Object v19 = ((java.lang.Throwable)v18).toString();
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Throwable)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateFromObjectWith();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = 62.311923084964334D;
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v14),(((java.lang.Double)v15).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).canCreateFromDouble();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = 0.0D;
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v14),(((java.lang.Double)v15).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v14),(((java.lang.Boolean)v15).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "";
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).mappingException(((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21));
    Object v23 = "DEFAULT_TYPING";
    Object v24 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v32));
    Object v34 = ",ignore=";
    Object v35 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v33),((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v28).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.Throwable)v35));
    ((java.lang.Throwable)v36).printStackTrace();
    Object v37 = null;
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).unwrapAndWrapException(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Throwable)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateFromString();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v16),(((java.lang.Boolean)v17).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new java.lang.Object[]{null};
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object[])v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).configureFromIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = ",ignore=";
    Object v21 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Throwable)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ",ignore=";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).wrapException(((java.lang.Throwable)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = ",ignore=";
    Object v19 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.Throwable)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = null;
    Object v14 = "DEFAULT_TYPING";
    Object v15 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).configureFromArraySettings(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.deser.SettableBeanProperty[])v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateFromLong();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).getDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).canCreateUsingDelegate();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateFromObjectWith();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = 21;
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v16),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateUsingDelegate();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = 0.0D;
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v15),(((java.lang.Double)v16).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19));
    Object v21 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationConfig)v20).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v21));
    Object v23 = "DEFAULT_TYPING";
    Object v24 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v32));
    Object v34 = ",ignore=";
    Object v35 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v33),((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v28).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.Throwable)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Throwable)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateFromString();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Boolean)v18).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new java.lang.Object[]{null};
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Object[])v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new java.lang.Object[]{null,null};
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object[])v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).getWithArgsCreator();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19));
    Object v21 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationConfig)v20).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v21));
    Object v23 = "DEFAULT_TYPING";
    Object v24 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v20),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v32));
    Object v34 = ",ignore=";
    Object v35 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v33),((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v28).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.Throwable)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).unwrapAndWrapException(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Throwable)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateFromInt();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).configureFromStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new java.lang.Object[]{};
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object[])v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).canCreateFromBoolean();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new java.lang.Object[]{null,null};
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object[])v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = -19;
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v14),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21));
    Object v23 = "DEFAULT_TYPING";
    Object v24 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v32));
    Object v34 = ",ignore=";
    Object v35 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v33),((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v28).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.Throwable)v35));
    Object v37 = ((java.lang.Throwable)v36).toString();
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Throwable)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = 23.676269374027108D;
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v15),(((java.lang.Double)v16).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateFromBoolean();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v15),(((java.lang.Boolean)v16).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = 18L;
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v15),(((java.lang.Long)v16).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v10).getIncompleteParameter();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((java.lang.Class)v9).getDeclaredMethods();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationConfig)v5).withFeatures(((com.fasterxml.jackson.core.FormatFeature[])v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = 34L;
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v13).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v16),(((java.lang.Long)v17).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "DEFAULT_TYPING";
    Object v16 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "DEFAULT_TYPING";
    Object v17 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "";
    Object v22 = "[";
    Object v23 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = 33;
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v15),(((java.lang.Integer)v24).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "[recursive type; ";
    Object v16 = new java.lang.Object[]{null};
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).mappingException(((java.lang.String)v15),((java.lang.Object[])v16));
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v14),(((java.lang.Boolean)v18).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((java.lang.Class)v9).getDeclaredMethods();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((java.lang.Class)v9).getDeclaredMethods();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v9));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).canCreateFromLong();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = "DEFAULT_TYPING";
    Object v7 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v11).getFromObjectArguments(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withoutAttribute(((java.lang.Object)v6));
    Object v8 = "DEFAULT_TYPING";
    Object v9 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateFromDouble();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }
}
