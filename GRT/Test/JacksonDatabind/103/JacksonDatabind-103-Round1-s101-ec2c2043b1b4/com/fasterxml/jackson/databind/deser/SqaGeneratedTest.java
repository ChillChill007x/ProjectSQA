package com.fasterxml.jackson.databind.deser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "OBJ";
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v14),((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.introspect.Annotated)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).flushCachedDeserializers();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    ((com.fasterxml.jackson.databind.DeserializationContext)v4).checkUnresolvedObjectId();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._createAndCacheValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).leaseObjectBuffer();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCacheValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType[])v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).hasOneOf(((java.lang.Class[])v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findConverter(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findConverter(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = "; expected Class<PropertyNamingStrategy>";
    Object v7 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v8 = java.text.DateFormat.getDateInstance();
    Object v9 = ")";
    Object v10 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer)v7),((java.text.DateFormat)v8),((java.lang.String)v9));
    ((com.fasterxml.jackson.databind.DeserializationContext)v4).reportUnknownProperty(((java.lang.Object)v5),((java.lang.String)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType[])v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 1;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v22).findTypeParameters(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new java.lang.StringBuilder();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v11).getErasedSignature(((java.lang.StringBuilder)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = "r)";
    Object v7 = ":";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = "OBJ";
    Object v21 = 1;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.Class)v19),((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.introspect.Annotated)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7),((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = "number";
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createDeserializer2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.BeanDescription)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCacheValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "OBJ";
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.Annotated)v20).getRawType();
    Object v22 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = new java.lang.StringBuilder();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v8).getErasedSignature(((java.lang.StringBuilder)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "OBJ";
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v14),((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findConverter(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.introspect.Annotated)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).getAnnotation(((java.lang.Class)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v25 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findConvertingDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = "";
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType[])v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).weirdNativeValueException(((java.lang.Object)v5),((java.lang.Class)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).flushCachedDeserializers();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._handleUnknownKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).containedTypeName((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.JavaType)v5));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._createDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new java.lang.StringBuilder();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v8),((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v13).withTypeHandler(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "";
    Object v9 = "xstring";
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).weirdKeyException(((java.lang.Class)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v14 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v13));
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v19).findSuperType(((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).getRawType();
    Object v21 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v22 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findConvertingDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "ite";
    Object v5 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).mappingException(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "OBJ";
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v22 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findConvertingDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.introspect.Annotated)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "OBJ";
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v22 = java.text.DateFormat.getDateInstance();
    Object v23 = ")";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer)v21),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findConvertingDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCacheValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getInterfaces();
    Object v5 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType[])v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v19).isInterface();
    Object v21 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._handleUnknownValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = ")";
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Invalid Object Id definition for ";
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).weirdStringException(((java.lang.String)v5),((java.lang.Class)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCacheValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).flushCachedDeserializers();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findConverter(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).getInterfaces();
    Object v19 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v19 = 1;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCacheValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v19 = 1;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v21 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findConvertingDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).getArrayBuilders();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findConverter(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "OBJ";
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v14),((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v20 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findConvertingDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.introspect.Annotated)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v21 = java.text.DateFormat.getDateInstance();
    Object v22 = ")";
    Object v23 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer)v20),((java.text.DateFormat)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findConvertingDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getGenericSignature();
    Object v5 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v21 = 1;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).isThrowable();
    Object v10 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ":b ";
    Object v5 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).mappingException(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new java.lang.StringBuilder();
    Object v19 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v20 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).containedTypeCount();
    Object v7 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new java.lang.StringBuilder();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v17 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = 1;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = 1;
    Object v28 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v27).intValue()));
    Object v29 = 1;
    Object v30 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v29).intValue()));
    Object v31 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v17).refine(((java.lang.Class)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v26),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.JavaType[])v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).getErasedSignature();
    Object v13 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v11));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType[])v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 1;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v22).findSuperType(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6));
    Object v8 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v9 = "string";
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.core.JsonToken)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = 1;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = "OBJ";
    Object v23 = 1;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.Class)v21),((java.lang.String)v22),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = -5;
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).containedType((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._createDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).getSuperClass();
    Object v13 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "OBJ";
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = 1;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).weirdNativeValueException(((java.lang.Object)v6),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).flushCachedDeserializers();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v8 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).endOfInputException(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v23 = 1;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v19),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCacheValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._createAndCacheValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new java.lang.StringBuilder();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v11).getGenericSignature(((java.lang.StringBuilder)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._createAndCache2(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).leaseObjectBuffer();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).flushCachedDeserializers();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = "false";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v23 = 1;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v19),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = 1;
    Object v27 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v25).withTypeHandler(((java.lang.Object)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).hasValueDeserializerFor(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).flushCachedDeserializers();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "OBJ";
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).getErasedSignature();
    Object v9 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5),((com.fasterxml.jackson.databind.JavaType)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    ((com.fasterxml.jackson.databind.DeserializationContext)v4).checkUnresolvedObjectId();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "OBJ";
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = "string";
    Object v7 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v4).reportUnknownProperty(((java.lang.Object)v5),((java.lang.String)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = "OBJ";
    Object v21 = 1;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.Class)v19),((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).writeReplace();
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v1)._findCachedDeserializer(((com.fasterxml.jackson.databind.JavaType)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).flushCachedDeserializers();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v19 = 1;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0).findValueDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6),((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.DeserializerCache)v0)._createDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
