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
    Object v5 = null;
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 2;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).findKeyDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = null;
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = 2;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v7),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).resolveMemberAndTypeAnnotations(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22),((com.fasterxml.jackson.databind.JavaType)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = 3L;
    Object v6 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v5).longValue()));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6));
    Object v8 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    Object v9 = "";
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v4).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.core.JsonToken)v8),((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = null;
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = 2;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v7),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).findKeyDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.introspect.Annotated)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = null;
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = 2;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v7),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.introspect.Annotated)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v11 = java.text.DateFormat.getTimeInstance();
    Object v12 = null;
    Object v13 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.time.ZoneId.systemDefault();
    Object v16 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v11),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v12),((java.util.Locale)v14),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v32).getGenericSignature();
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._findJsonValueFor(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v9 = java.text.DateFormat.getTimeInstance();
    Object v10 = null;
    Object v11 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = java.time.ZoneId.systemDefault();
    Object v14 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v13));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v9),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v10),((java.util.Locale)v12),((java.util.TimeZone)v14),((com.fasterxml.jackson.core.Base64Variant)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = null;
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v34 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v32),((com.fasterxml.jackson.databind.type.TypeBindings)v33));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = 2;
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.introspect.Annotated)v37),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v27),((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).modifyTypeByAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v27),((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v33));
    Object v35 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v34));
    Object v36 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType[])v26),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = null;
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).createCollectionDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.type.CollectionType)v36),((com.fasterxml.jackson.databind.BeanDescription)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = null;
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8).createBuilderBasedDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.BeanDescription)v22),((java.lang.Class)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = "DYNAMIC";
    Object v16 = "False";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).weirdKeyException(((java.lang.Class)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = null;
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v30 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v28),((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = 2;
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v18),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.introspect.Annotated)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v25 = java.text.DateFormat.getTimeInstance();
    Object v26 = null;
    Object v27 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v28 = java.util.Locale.forLanguageTag(((java.lang.String)v27));
    Object v29 = java.time.ZoneId.systemDefault();
    Object v30 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v29));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v20),((com.fasterxml.jackson.databind.AnnotationIntrospector)v21),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v24),((java.text.DateFormat)v25),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v26),((java.util.Locale)v28),((java.util.TimeZone)v30),((com.fasterxml.jackson.core.Base64Variant)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v34 = null;
    Object v35 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v36 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v37 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v32),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v33),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v34),((com.fasterxml.jackson.databind.util.RootNameLookup)v35),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.DeserializationConfig)v37));
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = null;
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = 2;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v7),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.Annotated)v22).hasAnnotation(((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.introspect.Annotated)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = ((com.fasterxml.jackson.databind.introspect.Annotated)v27).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v11 = java.text.DateFormat.getTimeInstance();
    Object v12 = null;
    Object v13 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.time.ZoneId.systemDefault();
    Object v16 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v11),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v12),((java.util.Locale)v14),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v10));
    Object v11 = null;
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 2;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v8),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v6 = ".";
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = Short.valueOf((short)0);
    Object v16 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer(((java.lang.Class)v14),((java.lang.Short)v15));
    ((com.fasterxml.jackson.databind.DeserializationContext)v4).reportUnknownProperty(((java.lang.Object)v5),((java.lang.String)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v17 = null;
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v26).isInterface();
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v10 = java.text.DateFormat.getTimeInstance();
    Object v11 = null;
    Object v12 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = java.time.ZoneId.systemDefault();
    Object v15 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v9),((java.text.DateFormat)v10),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v11),((java.util.Locale)v13),((java.util.TimeZone)v15),((com.fasterxml.jackson.core.Base64Variant)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((java.lang.Class)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v11 = java.text.DateFormat.getTimeInstance();
    Object v12 = null;
    Object v13 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.time.ZoneId.systemDefault();
    Object v16 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v10),((java.text.DateFormat)v11),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v12),((java.util.Locale)v14),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v18 = java.text.DateFormat.getTimeInstance();
    Object v19 = null;
    Object v20 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = java.time.ZoneId.systemDefault();
    Object v23 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v22));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v17),((java.text.DateFormat)v18),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v19),((java.util.Locale)v21),((java.util.TimeZone)v23),((com.fasterxml.jackson.core.Base64Variant)v24));
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v29 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v30 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v25),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v26),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v27),((com.fasterxml.jackson.databind.util.RootNameLookup)v28),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v29));
    Object v31 = ((com.fasterxml.jackson.databind.DeserializationConfig)v30).withNoProblemHandlers();
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.DeserializationConfig)v30));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = java.time.ZoneId.systemDefault();
    Object v17 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v24),((java.lang.Class)v32));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = null;
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 2;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.introspect.Annotated)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v9 = java.text.DateFormat.getTimeInstance();
    Object v10 = null;
    Object v11 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = java.time.ZoneId.systemDefault();
    Object v14 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v13));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v9),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v10),((java.util.Locale)v12),((java.util.TimeZone)v14),((com.fasterxml.jackson.core.Base64Variant)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = null;
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v34 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v32),((com.fasterxml.jackson.databind.type.TypeBindings)v33));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = 2;
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((com.fasterxml.jackson.databind.introspect.Annotated)v37),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v15 = java.text.DateFormat.getTimeInstance();
    Object v16 = null;
    Object v17 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = java.time.ZoneId.systemDefault();
    Object v20 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v19));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v14),((java.text.DateFormat)v15),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v16),((java.util.Locale)v18),((java.util.TimeZone)v20),((com.fasterxml.jackson.core.Base64Variant)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v27),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).getName();
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = null;
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = 2;
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v9),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v13 = java.text.DateFormat.getTimeInstance();
    Object v14 = null;
    Object v15 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = java.time.ZoneId.systemDefault();
    Object v18 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v12),((java.text.DateFormat)v13),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v14),((java.util.Locale)v16),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v25).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((java.lang.Class)v35));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = new java.lang.Class[]{null,null,null};
    Object v29 = ((com.fasterxml.jackson.databind.introspect.Annotated)v27).hasOneOf(((java.lang.Class[])v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v14 = java.text.DateFormat.getTimeInstance();
    Object v15 = null;
    Object v16 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = java.time.ZoneId.systemDefault();
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v13),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v19),((com.fasterxml.jackson.core.Base64Variant)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v26),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = true;
    Object v9 = "strin";
    Object v10 = -22;
    Object v11 = " tZo ";
    Object v12 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v8),((java.lang.String)v9),((java.lang.Integer)v10),((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).weirdNativeValueException(((java.lang.Object)v12),((java.lang.Class)v20));
    Object v22 = null;
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v34 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v32),((com.fasterxml.jackson.databind.type.TypeBindings)v33));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = 2;
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35),(((java.lang.Integer)v36).intValue()));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).findKeyDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v21 = java.text.DateFormat.getTimeInstance();
    Object v22 = null;
    Object v23 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = java.time.ZoneId.systemDefault();
    Object v26 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v25));
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v16),((com.fasterxml.jackson.databind.AnnotationIntrospector)v17),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20),((java.text.DateFormat)v21),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v22),((java.util.Locale)v24),((java.util.TimeZone)v26),((com.fasterxml.jackson.core.Base64Variant)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v32 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v33 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v28),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v29),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v30),((com.fasterxml.jackson.databind.util.RootNameLookup)v31),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v33));
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v14 = java.text.DateFormat.getTimeInstance();
    Object v15 = null;
    Object v16 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = java.time.ZoneId.systemDefault();
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v13),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v19),((com.fasterxml.jackson.core.Base64Variant)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = ((java.lang.Class)v34).getFields();
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v26),((java.lang.Class)v34));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).getFactoryConfig();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v22 = java.text.DateFormat.getTimeInstance();
    Object v23 = null;
    Object v24 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = java.time.ZoneId.systemDefault();
    Object v27 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v26));
    Object v28 = null;
    Object v29 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v21),((java.text.DateFormat)v22),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v23),((java.util.Locale)v25),((java.util.TimeZone)v27),((com.fasterxml.jackson.core.Base64Variant)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v33 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v34 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v29),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v30),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v31),((com.fasterxml.jackson.databind.util.RootNameLookup)v32),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v33));
    Object v35 = java.text.DateFormat.getTimeInstance();
    Object v36 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v34).with(((java.text.DateFormat)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v34));
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v5));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withDeserializerModifier(((com.fasterxml.jackson.databind.deser.BeanDeserializerModifier)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = null;
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 2;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).findKeyDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v13 = java.text.DateFormat.getTimeInstance();
    Object v14 = null;
    Object v15 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = java.time.ZoneId.systemDefault();
    Object v18 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v12),((java.text.DateFormat)v13),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v14),((java.util.Locale)v16),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = java.time.ZoneId.systemDefault();
    Object v27 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v25).with(((java.util.TimeZone)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = "string";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v35));
    Object v37 = ((java.lang.Class)v36).isArray();
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((java.lang.Class)v36));
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = null;
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 2;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.introspect.Annotated)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v14 = java.text.DateFormat.getTimeInstance();
    Object v15 = null;
    Object v16 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = java.time.ZoneId.systemDefault();
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v13),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v17),((java.util.TimeZone)v19),((com.fasterxml.jackson.core.Base64Variant)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v26),((java.lang.Class)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v22 = java.text.DateFormat.getTimeInstance();
    Object v23 = null;
    Object v24 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = java.time.ZoneId.systemDefault();
    Object v27 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v26));
    Object v28 = null;
    Object v29 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v21),((java.text.DateFormat)v22),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v23),((java.util.Locale)v25),((java.util.TimeZone)v27),((com.fasterxml.jackson.core.Base64Variant)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v33 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v34 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v29),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v30),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v31),((com.fasterxml.jackson.databind.util.RootNameLookup)v32),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v19 = java.text.DateFormat.getTimeInstance();
    Object v20 = null;
    Object v21 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v22 = java.util.Locale.forLanguageTag(((java.lang.String)v21));
    Object v23 = java.time.ZoneId.systemDefault();
    Object v24 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v18),((java.text.DateFormat)v19),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v20),((java.util.Locale)v22),((java.util.TimeZone)v24),((com.fasterxml.jackson.core.Base64Variant)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = null;
    Object v29 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v30 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v31 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v26),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v27),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v28),((com.fasterxml.jackson.databind.util.RootNameLookup)v29),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v9 = java.text.DateFormat.getTimeInstance();
    Object v10 = null;
    Object v11 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = java.time.ZoneId.systemDefault();
    Object v14 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v13));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v8),((java.text.DateFormat)v9),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v10),((java.util.Locale)v12),((java.util.TimeZone)v14),((com.fasterxml.jackson.core.Base64Variant)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = "string";
    Object v35 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v34));
    Object v36 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33),((java.lang.Enum)v35));
    Object v37 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v36));
    Object v38 = ((java.lang.Class)v29).isNestmateOf(((java.lang.Class)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v21),((java.lang.Class)v29));
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = null;
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = 2;
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v9),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).modifyTypeByAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v24),((com.fasterxml.jackson.databind.JavaType)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = 0;
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v14).containedType((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v22 = java.text.DateFormat.getTimeInstance();
    Object v23 = null;
    Object v24 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = java.time.ZoneId.systemDefault();
    Object v27 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v26));
    Object v28 = null;
    Object v29 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v21),((java.text.DateFormat)v22),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v23),((java.util.Locale)v25),((java.util.TimeZone)v27),((com.fasterxml.jackson.core.Base64Variant)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v33 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v34 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v29),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v30),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v31),((com.fasterxml.jackson.databind.util.RootNameLookup)v32),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.DeserializationConfig)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v31 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = java.time.ZoneId.systemDefault();
    Object v17 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v15),((java.util.TimeZone)v17),((com.fasterxml.jackson.core.Base64Variant)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v24),((com.fasterxml.jackson.databind.JavaType)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = null;
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 2;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.Annotated)v29).getAnnotated();
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = null;
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 2;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v21 = java.text.DateFormat.getTimeInstance();
    Object v22 = null;
    Object v23 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = java.time.ZoneId.systemDefault();
    Object v26 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v25));
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v16),((com.fasterxml.jackson.databind.AnnotationIntrospector)v17),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20),((java.text.DateFormat)v21),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v22),((java.util.Locale)v24),((java.util.TimeZone)v26),((com.fasterxml.jackson.core.Base64Variant)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v32 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v33 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v28),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v29),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v30),((com.fasterxml.jackson.databind.util.RootNameLookup)v31),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v32));
    Object v34 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v35 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v33).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6)._mapAbstractCollectionType(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v33));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 2;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v8),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.Annotated)v23).getRawType();
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = null;
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 2;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = "string";
    Object v35 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v34));
    Object v36 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33),((java.lang.Enum)v35));
    Object v37 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v36));
    Object v38 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).modifyTypeByAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v29),((com.fasterxml.jackson.databind.JavaType)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = null;
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 2;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.introspect.Annotated)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).getArrayBuilders();
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = null;
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 2;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).findKeyDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 2;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = null;
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 2;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = "string";
    Object v35 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v34));
    Object v36 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33),((java.lang.Enum)v35));
    Object v37 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v36));
    Object v38 = ((com.fasterxml.jackson.databind.introspect.Annotated)v29).hasAnnotation(((java.lang.Class)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).findDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v13 = java.text.DateFormat.getTimeInstance();
    Object v14 = null;
    Object v15 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = java.time.ZoneId.systemDefault();
    Object v18 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v12),((java.text.DateFormat)v13),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v14),((java.util.Locale)v16),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationConfig)v25).withNoProblemHandlers();
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((java.lang.Class)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v16 = java.text.DateFormat.getTimeInstance();
    Object v17 = null;
    Object v18 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = java.time.ZoneId.systemDefault();
    Object v21 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v15),((java.text.DateFormat)v16),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v17),((java.util.Locale)v19),((java.util.TimeZone)v21),((com.fasterxml.jackson.core.Base64Variant)v22));
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = "string";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v35));
    Object v37 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v28),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).checkUnresolvedObjectId();
    Object v11 = null;
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.module.SimpleDeserializers();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).findContentDeserializerFromAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 2;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v16 = java.text.DateFormat.getTimeInstance();
    Object v17 = null;
    Object v18 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = java.time.ZoneId.systemDefault();
    Object v21 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v15),((java.text.DateFormat)v16),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v17),((java.util.Locale)v19),((java.util.TimeZone)v21),((com.fasterxml.jackson.core.Base64Variant)v22));
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = "string";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v35));
    Object v37 = ((java.lang.Class)v36).getSuperclass();
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10)._findRemappedType(((com.fasterxml.jackson.databind.DeserializationConfig)v28),((java.lang.Class)v36));
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 2;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v8),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.Annotated)v23).hasAnnotation(((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4)._hasCreatorAnnotation(((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v16 = java.text.DateFormat.getTimeInstance();
    Object v17 = null;
    Object v18 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = java.time.ZoneId.systemDefault();
    Object v21 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v15),((java.text.DateFormat)v16),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v17),((java.util.Locale)v19),((java.util.TimeZone)v21),((com.fasterxml.jackson.core.Base64Variant)v22));
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = "string";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v35));
    Object v37 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v28),((com.fasterxml.jackson.databind.JavaType)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v5 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v3).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).valueInstantiators();
    Object v4 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v4).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v6).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v8).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11).abstractTypeResolvers();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    org.junit.Assert.assertNotNull(v13);
  }
}
