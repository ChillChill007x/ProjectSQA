package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).isPotentialBeanType(((java.lang.Class)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).findBeanSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v2),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.BeanDescription)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = true;
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v14 = new java.lang.Class[]{null,null,null};
    Object v15 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v13),((java.lang.Class[])v14));
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v5),(((java.lang.Boolean)v6).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v16),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v6),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).customSerializers();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v10 = ((com.fasterxml.jackson.databind.SerializationConfig)v8).with(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = com.fasterxml.jackson.databind.SerializationFeature.FLUSH_AFTER_WRITE_VALUE;
    Object v12 = ((com.fasterxml.jackson.databind.SerializationConfig)v10).with(((com.fasterxml.jackson.databind.SerializationFeature)v11));
    Object v13 = null;
    Object v14 = new java.util.ArrayList();
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).removeSetterlessGetters(((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.BeanDescription)v13),((java.util.List)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v4),((java.lang.Class[])v5));
    Object v7 = new java.lang.Class[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).constructFilteredBeanWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v6),((java.lang.Class[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = false;
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v16 = new java.lang.Class[]{null,null,null};
    Object v17 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15),((java.lang.Class[])v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v7),(((java.lang.Boolean)v8).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v18),((com.fasterxml.jackson.databind.JsonSerializer)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).isContainerType();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isEnumType();
    Object v14 = "array";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ")";
    Object v6 = new java.lang.Object[]{null};
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).mappingException(((java.lang.String)v5),((java.lang.Object[])v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = ((java.lang.reflect.Type)v12).getTypeName();
    Object v14 = "array";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Class)v4).desiredAssertionStatus();
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).isPotentialBeanType(((java.lang.Class)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v8).narrowBy(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = com.fasterxml.jackson.databind.MapperFeature.USE_ANNOTATIONS;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.SerializationConfig)v8).with(((com.fasterxml.jackson.databind.MapperFeature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new java.util.ArrayList();
    Object v14 = new java.util.ArrayList();
    Object v15 = ((java.util.List)v13).addAll(((java.util.Collection)v14));
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).removeIgnorableTypes(((com.fasterxml.jackson.databind.SerializationConfig)v8),((com.fasterxml.jackson.databind.BeanDescription)v12),((java.util.List)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = null;
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = -22;
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v18),((java.lang.reflect.Type)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).findPropertyContentTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v12),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JsonSerializer)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v10).forcedNarrowBy(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v6),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).getGenericSignature();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_ROOT_VALUE;
    Object v15 = ((com.fasterxml.jackson.databind.SerializationConfig)v13).without(((com.fasterxml.jackson.databind.SerializationFeature)v14));
    Object v16 = null;
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = -22;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((java.lang.reflect.Type)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.SerializationConfig)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = ((java.lang.Class)v8).getSimpleName();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).isPotentialBeanType(((java.lang.Class)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = null;
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = -22;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v15),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findBeanSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.BeanDescription)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17));
    Object v19 = null;
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = -22;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = "array";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).getAnnotation(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).findPropertyContentTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.SerializationConfig)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = null;
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = -22;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v17),((java.lang.reflect.Type)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findPropertyContentTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = true;
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v18 = new java.lang.Class[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v17),((java.lang.Class[])v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = "array";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v20),((com.fasterxml.jackson.databind.JsonSerializer)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v18 = ((com.fasterxml.jackson.databind.SerializationConfig)v16).withFilters(((com.fasterxml.jackson.databind.ser.FilterProvider)v17));
    Object v19 = null;
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = -22;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = false;
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v18 = new java.lang.Class[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v17),((java.lang.Class[])v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = "array";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v20),((com.fasterxml.jackson.databind.JsonSerializer)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = null;
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = -22;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v17),((java.lang.reflect.Type)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findPropertyContentTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v10));
    Object v12 = false;
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v20 = new java.lang.Class[]{null,null,null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v21));
    Object v23 = "array";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v29 = "array";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v31));
    ((com.fasterxml.jackson.databind.JsonSerializer)v26).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v28),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v33 = null;
    Object v34 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v9),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v22),((com.fasterxml.jackson.databind.JsonSerializer)v26));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = null;
    Object v17 = new java.util.ArrayList();
    Object v18 = ((java.util.List)v17).iterator();
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).removeIgnorableTypes(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.BeanDescription)v16),((java.util.List)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = null;
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = -22;
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((java.lang.reflect.Type)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.BeanSerializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v11));
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JsonSerializer)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).isContainerType();
    Object v20 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).customSerializers();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = true;
    Object v22 = "array";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.type.TypeFactory)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v29 = new java.lang.Class[]{null,null,null};
    Object v30 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v28),((java.lang.Class[])v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v27),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = "array";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v16).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v20),(((java.lang.Boolean)v21).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JsonSerializer)v35));
    Object v37 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22));
    Object v24 = null;
    Object v25 = "array";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = -22;
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((java.lang.reflect.Type)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.SerializationConfig)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isEnumType();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = null;
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = -22;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((java.lang.reflect.Type)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findPropertyContentTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isFinal();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = new com.fasterxml.jackson.databind.MapperFeature[]{};
    Object v14 = ((com.fasterxml.jackson.databind.SerializationConfig)v12).without(((com.fasterxml.jackson.databind.MapperFeature[])v13));
    Object v15 = null;
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = -22;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v15),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.SerializationConfig)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = null;
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = -22;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v15),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findPropertyContentTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.BeanSerializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v18));
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v12).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((java.lang.Class)v14).getGenericSuperclass();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).isPotentialBeanType(((java.lang.Class)v14));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v5).widenBy(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.ser.BeanSerializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v17));
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).withStaticTyping();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = null;
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = -22;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14),((java.lang.reflect.Type)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.SerializationConfig)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = null;
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = -22;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v15),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.Annotated)v21).getAnnotated();
    Object v23 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = ((com.fasterxml.jackson.databind.SerializationConfig)v14).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v24 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v22).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v23));
    Object v25 = "array";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v28).isContainerType();
    Object v30 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v24).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v28));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v31));
    Object v33 = "array";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v35));
    ((com.fasterxml.jackson.databind.JsonSerializer)v30).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v32),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v37 = null;
    Object v38 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JsonSerializer)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = "array";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v12).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isFinal();
    Object v12 = null;
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5)._createSerializer2(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.BeanDescription)v12),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).isPotentialBeanType(((java.lang.Class)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v12).isPotentialBeanType(((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.ser.BeanSerializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v24 = java.lang.ClassLoader.getSystemClassLoader();
    Object v25 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v27 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26));
    ((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v18).setFilterId(((java.lang.Object)v27));
    Object v28 = null;
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v18));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = false;
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v18 = new java.lang.Class[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v17),((java.lang.Class[])v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = "array";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v20),((com.fasterxml.jackson.databind.JsonSerializer)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).customSerializers();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v12).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).withStaticTyping();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19));
    Object v21 = null;
    Object v22 = "array";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = -22;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.SerializationConfig)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).getFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = com.fasterxml.jackson.databind.SerializationFeature.EAGER_SERIALIZER_FETCH;
    Object v16 = ((com.fasterxml.jackson.databind.SerializationConfig)v14).without(((com.fasterxml.jackson.databind.SerializationFeature)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v8).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isContainerType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v10).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v14));
    ((com.fasterxml.jackson.databind.SerializerProvider)v6).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v17 = null;
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v12).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v13));
    Object v15 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v14).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = null;
    Object v14 = "array";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = -22;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.SerializationConfig)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).isConcrete();
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v22));
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v25 = com.fasterxml.jackson.databind.node.NullNode.getInstance();
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.JsonSerializer)v23).serialize(((java.lang.Object)v24),((com.fasterxml.jackson.core.JsonGenerator)v27),((com.fasterxml.jackson.databind.SerializerProvider)v28));
    Object v29 = null;
    Object v30 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JsonSerializer)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = null;
    Object v18 = new java.util.ArrayList();
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).removeSetterlessGetters(((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.BeanDescription)v17),((java.util.List)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).getFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "array";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v27 = "array";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v29));
    ((com.fasterxml.jackson.databind.JsonSerializer)v24).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v26),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v31 = null;
    Object v32 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JsonSerializer)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v14).forcedNarrowBy(((java.lang.Class)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = null;
    Object v18 = new java.util.ArrayList();
    Object v19 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).filterBeanProperties(((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.BeanDescription)v17),((java.util.List)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.node.NullNode.getInstance();
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v19));
    ((com.fasterxml.jackson.databind.SerializationConfig)v17).initialize(((com.fasterxml.jackson.core.JsonGenerator)v20));
    Object v21 = null;
    Object v22 = "array";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = "array";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v12).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JsonSerializer)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v19));
    Object v21 = "array";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v23));
    Object v25 = "array";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JavaType)v24).widenBy(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v20).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v30 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JsonSerializer)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).getFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v24),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v25),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27));
    Object v29 = null;
    Object v30 = "array";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = -22;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v29),((java.lang.reflect.Type)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.SerializationConfig)v28),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).getFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = -4L;
    Object v21 = new java.util.Date((((java.lang.Long)v20).longValue()));
    Object v22 = "array";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.type.TypeFactory)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v29 = new java.lang.Class[]{null,null,null};
    Object v30 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v28),((java.lang.Class[])v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v27),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.Object)v21),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanSerializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v13));
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v12),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21));
    Object v23 = null;
    Object v24 = "array";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = -22;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).findPropertyTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.SerializationConfig)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "Attempted to unwrap single value array for single '";
    Object v10 = new java.lang.Object[]{null,null,null};
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).mappingException(((java.lang.String)v9),((java.lang.Object[])v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).getFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).isPotentialBeanType(((java.lang.Class)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = "array";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer(((java.lang.Class)v23));
    Object v25 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v26 = com.fasterxml.jackson.databind.node.NullNode.getInstance();
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.JsonSerializer)v24).serialize(((java.lang.Object)v25),((com.fasterxml.jackson.core.JsonGenerator)v28),((com.fasterxml.jackson.databind.SerializerProvider)v29));
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JsonSerializer)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = ((java.lang.Class)v8).getPackageName();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).isPotentialBeanType(((java.lang.Class)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v12).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v14).constructBeanSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v15),((com.fasterxml.jackson.databind.BeanDescription)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
