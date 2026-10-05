package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.Class)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v22));
    Object v24 = ((java.lang.reflect.Type)v23).getTypeName();
    Object v25 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v2),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = java.util.Map.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v22 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JsonSerializer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).isPotentialBeanType(((java.lang.Class)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = ((java.lang.Class)v7).getDeclaringClass();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).isPotentialBeanType(((java.lang.Class)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).isPrimitive();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v33),((com.fasterxml.jackson.databind.type.TypeFactory)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v37 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v35),((com.fasterxml.jackson.databind.BeanProperty)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer(((com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer)v25),((com.fasterxml.jackson.databind.BeanProperty)v26),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v37));
    Object v39 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JsonSerializer)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).isPotentialBeanType(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).customSerializers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v24).toString();
    Object v26 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = true;
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v22 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v8),(((java.lang.Boolean)v9).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v20),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v17));
    ((com.fasterxml.jackson.databind.SerializerProvider)v16).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v18));
    Object v19 = null;
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v26).isContainerType();
    Object v28 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v16),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((com.fasterxml.jackson.databind.BeanProperty)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer(((com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer)v3),((com.fasterxml.jackson.databind.BeanProperty)v4),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v15));
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v17 = null;
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v2),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = true;
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeFactory)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v26),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v30 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v16),(((java.lang.Boolean)v17).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JsonSerializer)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = "string";
    Object v35 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v34));
    Object v36 = java.util.EnumSet.of(((java.lang.Enum)v33),((java.lang.Enum)v35));
    Object v37 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v36));
    Object v38 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v37));
    Object v39 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v31),((com.fasterxml.jackson.databind.JavaType)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v14).withTypeHandler(((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v14));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).constructFilteredBeanWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v6),((java.lang.Class[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).isPotentialBeanType(((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = java.util.Map.of(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v32 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v28),((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).constructBeanSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.BeanDescription)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = java.util.Map.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((java.util.Map)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v24 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JsonSerializer)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).constructBeanSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanDescription)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).isPotentialBeanType(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = ((java.lang.Class)v13).getInterfaces();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).isPotentialBeanType(((java.lang.Class)v13));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = java.util.Map.of(((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((java.util.Map)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v31));
    Object v33 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = true;
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v28 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v26),((com.fasterxml.jackson.databind.JsonSerializer)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = java.util.Map.of(((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((java.util.Map)v18));
    Object v20 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v21 = ((com.fasterxml.jackson.databind.SerializationConfig)v19).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v33));
    Object v35 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v9 = new java.lang.Class[]{null,null,null};
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).constructFilteredBeanWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((java.lang.Class[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = java.util.Map.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((java.util.Map)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).constructBeanSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.BeanDescription)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v30 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JsonSerializer)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v19 = ((com.fasterxml.jackson.databind.SerializationConfig)v17).with(((com.fasterxml.jackson.databind.SerializationFeature)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v30 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v26),((java.lang.Object)v28),((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v32 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JsonSerializer)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v11));
    Object v13 = false;
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v22),((com.fasterxml.jackson.databind.BeanProperty)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v26 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v24),((com.fasterxml.jackson.databind.JsonSerializer)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v16).getInternalSetting(((java.lang.Object)v17));
    Object v19 = new java.lang.Class[]{null,null};
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v15).constructFilteredBeanWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v16),((java.lang.Class[])v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).customSerializers();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v11));
    Object v13 = false;
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v22),((com.fasterxml.jackson.databind.BeanProperty)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v26 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v24),((com.fasterxml.jackson.databind.JsonSerializer)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).isPotentialBeanType(((java.lang.Class)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = java.util.Map.of(((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((java.util.Map)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = java.util.Map.of(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v28).narrowBy(((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v29 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v11 = "Class ";
    Object v12 = "Unexpected JSON values; expected at most ";
    Object v13 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v10).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer)v13));
    Object v15 = new java.lang.Class[]{null,null};
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).constructFilteredBeanWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v10),((java.lang.Class[])v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = true;
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((com.fasterxml.jackson.databind.BeanProperty)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v24 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v22),((com.fasterxml.jackson.databind.JsonSerializer)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).getFactoryConfig();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = java.util.Map.of(((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((java.util.Map)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = java.util.Map.of(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).getGenericSignature();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).isPotentialBeanType(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18).keySerializers();
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = true;
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v28 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v26),((com.fasterxml.jackson.databind.JsonSerializer)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).isPotentialBeanType(((java.lang.Class)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = java.util.Map.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((java.util.Map)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v34));
    Object v36 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v38 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v36),((com.fasterxml.jackson.databind.JsonSerializer)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v28).withTypeHandler(((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = java.util.Map.of(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;
    Object v23 = ((com.fasterxml.jackson.databind.SerializationConfig)v21).withSerializationInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Include)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v35));
    Object v37 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    ((com.fasterxml.jackson.databind.SerializerProvider)v20).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v22));
    Object v23 = null;
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v20),((com.fasterxml.jackson.databind.JavaType)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).isPotentialBeanType(((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v29).isThrowable();
    Object v31 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = java.util.Map.of(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v20));
    Object v22 = null;
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18).keySerializers();
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v20).isPotentialBeanType(((java.lang.Class)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).isPotentialBeanType(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18).keySerializers();
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v21 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v22 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v20).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((java.lang.Class)v15).getNestMembers();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).isPotentialBeanType(((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = ((java.lang.Class)v13).getMethods();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).isPotentialBeanType(((java.lang.Class)v13));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).isPotentialBeanType(((java.lang.Class)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = java.util.Map.of(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = java.util.Map.of(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = java.util.Map.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((java.util.Map)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v17 = ((com.fasterxml.jackson.databind.SerializationConfig)v15).withFilters(((com.fasterxml.jackson.databind.ser.FilterProvider)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).removeSetterlessGetters(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.BeanDescription)v18),((java.util.List)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.type.TypeFactory)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v24).withContentValueHandler(((java.lang.Object)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = false;
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((com.fasterxml.jackson.databind.BeanProperty)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.type.TypeFactory)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v33),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer(((com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer)v23),((com.fasterxml.jackson.databind.BeanProperty)v24),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35));
    Object v37 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v22),((com.fasterxml.jackson.databind.JsonSerializer)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = java.util.Map.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((java.util.Map)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v34));
    Object v36 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v36).isConcrete();
    Object v38 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = java.util.Map.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((java.util.Map)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v22).isEnumType();
    Object v24 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v36 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34),((com.fasterxml.jackson.databind.BeanProperty)v35));
    Object v37 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer(((com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer)v24),((com.fasterxml.jackson.databind.BeanProperty)v25),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v36));
    Object v38 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JsonSerializer)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = null;
    Object v26 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).findBeanSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.BeanDescription)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6).serializerModifiers();
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v18),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v8 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v15 = "Class ";
    Object v16 = "Unexpected JSON values; expected at most ";
    Object v17 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer)v17));
    Object v19 = new java.lang.Class[]{null,null};
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).constructFilteredBeanWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14),((java.lang.Class[])v19));
    Object v21 = new java.lang.Class[]{null};
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).constructFilteredBeanWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v20),((java.lang.Class[])v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v6 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = "string";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v35));
    Object v37 = ((java.lang.Class)v30).getDeclaredAnnotation(((java.lang.Class)v36));
    Object v38 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).isPotentialBeanType(((java.lang.Class)v30));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }
}
