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
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
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
  public void test3() throws Throwable {
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
  public void test4() throws Throwable {
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
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    org.junit.Assert.assertNotNull(v3);
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
  public void test7() throws Throwable {
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
  public void test8() throws Throwable {
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
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
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
    Object v13 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v11).withoutAttribute(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = true;
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v27),((java.lang.reflect.Constructor)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34));
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
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10),((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = "[NULL]";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).isPotentialBeanType(((java.lang.Class)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType[])v11),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createEnumDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.BeanDescription)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
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
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType[])v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createMapLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.type.MapLikeType)v16),((com.fasterxml.jackson.databind.BeanDescription)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v22).equals(((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
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
  public void test17() throws Throwable {
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
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createCollectionLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.type.CollectionLikeType)v11),((com.fasterxml.jackson.databind.BeanDescription)v12));
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
    Object v20 = 0;
    Object v21 = new java.lang.StringBuilder((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
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
    Object v18 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JavaType)v27).getInterfaces();
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v24),((com.fasterxml.jackson.databind.JavaType)v27));
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
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
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
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v21),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
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
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
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
    Object v12 = Short.valueOf((short)-16);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    ((com.fasterxml.jackson.databind.DeserializationConfig)v11).initialize(((com.fasterxml.jackson.core.JsonParser)v14));
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v26).withStaticTyping();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v30 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v28),((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((java.lang.reflect.Constructor)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
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
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v23),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
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
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).getGenericSignature();
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
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).isPotentialBeanType(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24));
    Object v26 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v27 = ((com.fasterxml.jackson.databind.DeserializationConfig)v25).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v32 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.type.TypeBindings)v29),((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
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
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType[])v13),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).checkIllegalTypes(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.BeanDescription)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.reflect.Constructor)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18));
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
    Object v14 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES;
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationConfig)v13).with(((com.fasterxml.jackson.databind.DeserializationFeature)v14));
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
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26));
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
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v17).containedTypeOrUnknown((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).getFactoryConfig();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
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
    Object v10 = ((java.lang.Class)v9).getTypeParameters();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).isPotentialBeanType(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(true), v11);
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
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8),((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = ((com.fasterxml.jackson.databind.type.ArrayType)v11).withValueHandler(((java.lang.Object)v12));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createArrayDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.type.ArrayType)v11),((com.fasterxml.jackson.databind.BeanDescription)v14));
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
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11),((java.lang.Object)v12),((java.lang.Object)v13));
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
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
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
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createEnumDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.BeanDescription)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
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
    Object v22 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v21),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
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
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.introspect.Annotated)v25),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getCanonicalName();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).isPotentialBeanType(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(true), v13);
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
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18));
    Object v20 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationConfig)v19).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v20));
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
    Object v32 = ((com.fasterxml.jackson.databind.introspect.Annotated)v31).hashCode();
    Object v33 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((com.fasterxml.jackson.databind.introspect.Annotated)v31),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    org.junit.Assert.assertNotNull(v17);
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
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationConfig)v13).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "";
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).mappingException(((java.lang.String)v7),((java.lang.Object[])v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
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
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.core.type.ResolvedType)v8).isReferenceType();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).getFactoryConfig();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
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
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((java.lang.reflect.Type)v24).getTypeName();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = true;
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.reflect.Constructor)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = null;
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = true;
    Object v22 = "Can not use For atSchema of type ";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19),((com.fasterxml.jackson.databind.AnnotationIntrospector)v20),(((java.lang.Boolean)v21).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v24).getAccessor();
    Object v26 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).constructSetterlessProperty(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.BeanDescription)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
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
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).getAnnotation(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.introspect.Annotated)v25),((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationConfig)v17).with(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
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
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.core.type.ResolvedType)v18).isReferenceType();
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v18));
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
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.ReferenceType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).getInterfaces();
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
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
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
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).containedTypeCount();
    Object v16 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).isPotentialBeanType(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
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
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).isFinal();
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
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
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
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
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
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.reflect.Constructor)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28).hasAnnotation(((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
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
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v29).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v31).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v33).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.introspect.Annotated)v27),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
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
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.core.type.ResolvedType)v17).isReferenceType();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).findStdDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.BeanDescription)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
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
    Object v20 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
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
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).getFactoryConfig();
    org.junit.Assert.assertNotNull(v12);
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
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType[])v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v31 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v29),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v28).equals(((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v21).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationConfig)v15).withNoProblemHandlers();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType[])v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
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
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v21).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v22));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v24),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v25),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v27),((com.fasterxml.jackson.databind.util.RootNameLookup)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v23).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v23).getFactoryConfig();
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = 7;
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v14).containedTypeOrUnknown((((java.lang.Integer)v15).intValue()));
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
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findPropertyContentTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).findStdDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.BeanDescription)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
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
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).getFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).isPotentialBeanType(((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v12).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v13));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = "Can not use For atSchema of type ";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v15).withRootName(((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.reflect.Constructor)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v27));
    Object v29 = Short.valueOf((short)-16);
    Object v30 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v29).shortValue()));
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.introspect.Annotated)v28),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiators.Base();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = null;
    Object v16 = null;
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v11).addInjectables(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanDescription)v15),((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v16).withTypeHandler(((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType[])v15),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createCollectionDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.CollectionType)v21),((com.fasterxml.jackson.databind.BeanDescription)v22));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType[])v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.reflect.Constructor)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v10),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.reflect.Constructor)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v20).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v21));
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v22).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v23));
    Object v25 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v24).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v26).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v28).isPotentialBeanType(((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v2)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v18),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.deser.Deserializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0).valueInstantiators();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v2).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.core.type.ResolvedType)v16).isReferenceType();
    Object v18 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).withStaticTyping();
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = null;
    Object v16 = null;
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = "null";
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v23).addIgnorable(((java.lang.String)v24));
    Object v25 = null;
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).addInjectables(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanDescription)v15),((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v23));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).buildThrowableDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
