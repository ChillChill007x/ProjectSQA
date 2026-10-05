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
    Object v5 = -3.3754808469056057D;
    Object v6 = "NULL";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = "NULL";
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "]";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).weirdNumberException(((java.lang.Number)v5),((java.lang.Class)v11),((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = "NULL";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = "NULL";
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = "NULL";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = "NULL";
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = "(";
    Object v28 = "NULL";
    Object v29 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v28));
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((java.lang.Class)v26),((java.lang.String)v27),((java.lang.Class)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((java.lang.Class)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = "NULL";
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v8));
    Object v10 = "NULL";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = "NULL";
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v23));
    Object v25 = "NULL";
    Object v26 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = "(";
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = "NULL";
    Object v33 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v28),((java.lang.String)v29),((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.introspect.Annotated)v36).getType();
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.introspect.Annotated)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).getFactoryConfig();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = null;
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = false;
    Object v16 = "[visibe=";
    Object v17 = "[null]";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = "[visibe=";
    Object v21 = "[null]";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v19),((com.fasterxml.jackson.databind.PropertyName)v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v23).couldSerialize();
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._checkIfCreatorPropertyBased(((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v23));
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
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).valueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = "NULL";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = "NULL";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v17));
    Object v19 = "NULL";
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v19));
    Object v21 = "NULL";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v18).findMixInClassFor(((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.DeserializationConfig)v18));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
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
    Object v9 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).valueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = "NULL";
    Object v28 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v27));
    Object v29 = "NULL";
    Object v30 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = "NULL";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = "NULL";
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = "NULL";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = "NULL";
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = "(";
    Object v28 = "NULL";
    Object v29 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v28));
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((java.lang.Class)v26),((java.lang.String)v27),((java.lang.Class)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).findKeyDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((java.lang.Class)v19));
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
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "NULL";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = "NULL";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = "NULL";
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v13));
    Object v15 = "NULL";
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).getFactoryConfig();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).isContainerType();
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._findJsonValueFor(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "NULL";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = "NULL";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = "NULL";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((java.lang.Class)v15));
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
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).valueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v11 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.deser.Deserializers)v11).findBeanDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v26),((com.fasterxml.jackson.databind.BeanDescription)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v11));
    org.junit.Assert.assertNotNull(v29);
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
    Object v9 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).valueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v17));
    Object v19 = "NULL";
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v19));
    Object v21 = "NULL";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10)._findJsonValueFor(((com.fasterxml.jackson.databind.DeserializationConfig)v18),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = "NULL";
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v8));
    Object v10 = "NULL";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isPrimitive();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.DeserializationConfig)v23));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationConfig)v17).with(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v15).withAttribute(((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = "NULL";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = "NULL";
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = "NULL";
    Object v28 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v27));
    Object v29 = "NULL";
    Object v30 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = "NULL";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((java.lang.Class)v21));
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
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).valueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v11 = "NULL";
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v11));
    Object v13 = "NULL";
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = null;
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10)._findCustomEnumDeserializer(((java.lang.Class)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v24),((com.fasterxml.jackson.databind.BeanDescription)v25));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = "NULL";
    Object v29 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v28));
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v27),((java.lang.Class)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = "NULL";
    Object v28 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v27));
    Object v29 = "NULL";
    Object v30 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v34));
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
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "NULL";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = "NULL";
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = "NULL";
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v15));
    Object v17 = "NULL";
    Object v18 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = "NULL";
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = "NULL";
    Object v33 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v35));
    Object v37 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = null;
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createReferenceDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.type.ReferenceType)v37),((com.fasterxml.jackson.databind.BeanDescription)v38));
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
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = ((java.lang.Class)v19).getDeclaredClasses();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((java.lang.Class)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = "";
    Object v17 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v15).withRootName(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((java.lang.Class)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = "NULL";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = "NULL";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = "NULL";
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v11));
    Object v13 = "NULL";
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = "NULL";
    Object v18 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v17));
    Object v19 = "NULL";
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new java.lang.StringBuilder();
    Object v26 = "[visibe=";
    Object v27 = "[null]";
    Object v28 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v24),((java.lang.Object)v25),((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v29).isEnumType();
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v33 = null;
    Object v34 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v33));
    Object v35 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v34));
    Object v36 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v37 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v38 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v31),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v32),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v35),((com.fasterxml.jackson.databind.util.RootNameLookup)v36),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.DeserializationConfig)v38));
    org.junit.Assert.assertNull(v39);
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
    Object v7 = "NULL";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = "NULL";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = new java.lang.StringBuilder();
    Object v29 = "[visibe=";
    Object v30 = "[null]";
    Object v31 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v27),((java.lang.Object)v28),((java.lang.Object)v31));
    Object v33 = null;
    Object v34 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3).createBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.BeanDescription)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = "NULL";
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v5));
    Object v7 = "NULL";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "NULL";
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v13));
    Object v15 = "NULL";
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).withNoProblemHandlers();
    Object v13 = "NULL";
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v13));
    Object v15 = "NULL";
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._findJsonValueFor(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "NULL";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = "NULL";
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = "NULL";
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new java.lang.StringBuilder();
    Object v31 = "[visibe=";
    Object v32 = "[null]";
    Object v33 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v29),((java.lang.Object)v30),((java.lang.Object)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v34));
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
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((java.lang.Class)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = "NULL";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = null;
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).constructEnumResolver(((java.lang.Class)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMethod)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._findJsonValueFor(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationConfig)v17).withNoProblemHandlers();
    Object v19 = "NULL";
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v19));
    Object v21 = "NULL";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((java.lang.Class)v24));
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
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationConfig)v19).getDefaultPropertyInclusion(((java.lang.Class)v25));
    Object v27 = "NULL";
    Object v28 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v27));
    Object v29 = "NULL";
    Object v30 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = ((java.lang.Class)v32).getDeclaredClasses();
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((java.lang.Class)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v22).getInterfaces();
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v28));
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = "NULL";
    Object v33 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v21).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v29),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "NULL";
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v15));
    Object v17 = "NULL";
    Object v18 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v21),((java.util.concurrent.atomic.AtomicReference)v24));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11)._findCreatorsFromProperties(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanDescription)v26));
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
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = "NULL";
    Object v29 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v28));
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v27),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._findJsonValueFor(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v35));
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
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v23));
    Object v25 = "NULL";
    Object v26 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v25));
    Object v27 = "NULL";
    Object v28 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._findJsonValueFor(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = "NULL";
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v8));
    Object v10 = "NULL";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = "NULL";
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v23));
    Object v25 = "NULL";
    Object v26 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = "(";
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = "NULL";
    Object v33 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v28),((java.lang.String)v29),((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findKeyDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.introspect.Annotated)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((java.lang.Class)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
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
    Object v9 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8).valueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = "NULL";
    Object v15 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).isAbstract();
    Object v22 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = "NULL";
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v24));
    Object v26 = "NULL";
    Object v27 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v29));
    Object v31 = "NULL";
    Object v32 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v31));
    Object v33 = "NULL";
    Object v34 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v35));
    Object v37 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v36));
    Object v38 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).getFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = "NULL";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = com.fasterxml.jackson.databind.DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE;
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationConfig)v24).with(((com.fasterxml.jackson.databind.DeserializationFeature)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v24));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findValueInstantiator(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.BeanDescription)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).getFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v28));
    Object v30 = "NULL";
    Object v31 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v30));
    Object v32 = "NULL";
    Object v33 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v35));
    Object v37 = 1;
    Object v38 = ((com.fasterxml.jackson.databind.JavaType)v36).containedTypeOrUnknown((((java.lang.Integer)v37).intValue()));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v21).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v29),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((java.lang.Class)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10).valueInstantiators();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = "NULL";
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = "NULL";
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v24));
    Object v26 = "NULL";
    Object v27 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((java.lang.Class)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    org.junit.Assert.assertNotNull(v13);
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
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v18));
    Object v20 = "NULL";
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v26).isConcrete();
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = "NULL";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = "NULL";
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = new java.lang.StringBuilder();
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v27).getGenericSignature(((java.lang.StringBuilder)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v20),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
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
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationConfig)v19).withNoProblemHandlers();
    Object v21 = "NULL";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = "NULL";
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((java.lang.Class)v26));
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
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v17).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v19).getFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = "NULL";
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v22));
    Object v24 = "NULL";
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = "NULL";
    Object v30 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v29));
    Object v31 = "NULL";
    Object v32 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v34));
    Object v36 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v29 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v30 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v27),((com.fasterxml.jackson.databind.util.RootNameLookup)v28),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v15)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = "NULL";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = "NULL";
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = "NULL";
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v23));
    Object v25 = "NULL";
    Object v26 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v28));
    Object v30 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v33 = null;
    Object v34 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v33));
    Object v35 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v34));
    Object v36 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v37 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v38 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v31),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v32),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v35),((com.fasterxml.jackson.databind.util.RootNameLookup)v36),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.DeserializationConfig)v38));
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v14));
    Object v16 = "NULL";
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v16));
    Object v18 = "NULL";
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v29 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v30 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v27),((com.fasterxml.jackson.databind.util.RootNameLookup)v28),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v13)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v30));
    org.junit.Assert.assertNull(v31);
  }
}
