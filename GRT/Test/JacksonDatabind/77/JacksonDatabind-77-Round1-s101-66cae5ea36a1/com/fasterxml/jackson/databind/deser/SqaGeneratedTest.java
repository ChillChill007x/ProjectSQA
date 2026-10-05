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
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).createBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.BeanDescription)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.reflect.Constructor)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v17),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v7),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType[])v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType[])v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v10).equals(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).isPotentialBeanType(((java.lang.Class)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).withoutFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = ((com.fasterxml.jackson.core.type.ResolvedType)v14).toCanonical();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = true;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).getFactoryConfig();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getPackageName();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).isPotentialBeanType(((java.lang.Class)v7));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v24),((java.lang.Object)v25),((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v31 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v29),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = true;
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v31),((java.lang.reflect.Constructor)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v36),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = ((com.fasterxml.jackson.databind.JavaType)v26).equals(((java.lang.Object)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType[])v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = true;
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.reflect.Constructor)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v29));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30).fixAccess();
    Object v31 = null;
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v20).equals(((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createCollectionLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.type.CollectionLikeType)v9),((com.fasterxml.jackson.databind.BeanDescription)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).buildBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.BeanDescription)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = true;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).hashCode();
    Object v27 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.introspect.Annotated)v25),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createCollectionLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.type.CollectionLikeType)v11),((com.fasterxml.jackson.databind.BeanDescription)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v10).equals(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).isConcrete();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.reflect.Constructor)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v16));
    Object v18 = 0;
    Object v19 = new java.lang.StringBuilder((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v17),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.Annotated)v23).getRawType();
    Object v25 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v23),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).isConcrete();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((com.fasterxml.jackson.databind.introspect.Annotated)v29),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).buildBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.BeanDescription)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = null;
    Object v18 = null;
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v24));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).addBeanProps(((com.fasterxml.jackson.databind.DeserializationContext)v16),((com.fasterxml.jackson.databind.BeanDescription)v17),((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v27),((com.fasterxml.jackson.databind.type.TypeBindings)v28),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v34).isPrimitive();
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v34));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).isPotentialBeanType(((java.lang.Class)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = true;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.introspect.Annotated)v33),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).findValueInstantiator(((com.fasterxml.jackson.databind.DeserializationContext)v18),((com.fasterxml.jackson.databind.BeanDescription)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = true;
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((java.lang.reflect.Constructor)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v30));
    Object v32 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.introspect.Annotated)v31),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).isPotentialBeanType(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v27),((com.fasterxml.jackson.databind.type.TypeBindings)v28),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).isPrimitive();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).createCollectionLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.type.CollectionLikeType)v8),((com.fasterxml.jackson.databind.BeanDescription)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v8).findMixInClassFor(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = true;
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.reflect.Constructor)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = false;
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v21),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.reflect.Constructor)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v19).equals(((java.lang.Object)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v12).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).hashCode();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10).deserializers();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v12).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = true;
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((java.lang.reflect.Constructor)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).isPotentialBeanType(((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v15).isPotentialBeanType(((java.lang.Class)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v10).without(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).getSuperClass();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationConfig)v12).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v12),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v25),((java.lang.reflect.Constructor)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType[])v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = true;
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.reflect.Constructor)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = 16;
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v12).containedType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24).getMember();
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).isPotentialBeanType(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).isPotentialBeanType(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v10).forcedNarrowBy(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = new java.lang.Class[]{};
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19).hasOneOf(((java.lang.Class[])v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isConcrete();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.reflect.Constructor)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v9).withRootName(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = true;
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((java.lang.reflect.Constructor)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ")";
    Object v36 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v34),((java.lang.String)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.introspect.Annotated)v31),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7).deserializers();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = new com.fasterxml.jackson.databind.MapperFeature[]{};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v8).without(((com.fasterxml.jackson.databind.MapperFeature[])v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.reflect.Constructor)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v20),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6).abstractTypeResolvers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v8).refine(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = null;
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).findDefaultDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.BeanDescription)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v31));
    Object v33 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v34 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v29),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v30),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v32),((com.fasterxml.jackson.databind.util.RootNameLookup)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = 0;
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v35).containedType((((java.lang.Integer)v36).intValue()));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v34),((com.fasterxml.jackson.databind.JavaType)v35));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v32 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.type.TypeBindings)v31),((java.lang.Object)v32),((java.lang.Object)v33));
    Object v35 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType[])v29),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v24),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v6).isPotentialBeanType(((java.lang.Class)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6).abstractTypeResolvers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17));
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = true;
    Object v21 = "Can not use For atSchema of type ";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v18),((com.fasterxml.jackson.databind.AnnotationIntrospector)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v31 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.type.TypeBindings)v30),((java.lang.Object)v31),((java.lang.Object)v32));
    Object v34 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType[])v28),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v8).constructSettableProperty(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.BeanDescription)v12),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v23),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).deserializers();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).getFactoryConfig();
    org.junit.Assert.assertNotNull(v5);
  }
}
