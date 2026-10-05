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
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer(((com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer)v9),((com.fasterxml.jackson.databind.BeanProperty)v10),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v21));
    ((com.fasterxml.jackson.databind.SerializerProvider)v8).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v22));
    Object v23 = null;
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v30));
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
    Object v15 = 1;
    Object v16 = new java.lang.StringBuilder((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v14).withTypeHandler(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v14));
    org.junit.Assert.assertNotNull(v18);
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
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
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
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = ((java.lang.Class)v28).getDeclaredAnnotations();
    Object v30 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).isPotentialBeanType(((java.lang.Class)v28));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).isPotentialBeanType(((java.lang.Class)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
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
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
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
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v35 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v28),((java.lang.Object)v33),((java.lang.Object)v34));
    Object v36 = ((java.lang.reflect.Type)v35).getTypeName();
    Object v37 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v38 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v35),((com.fasterxml.jackson.databind.JsonSerializer)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
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
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v22));
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
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v15));
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
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
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
  public void test32() throws Throwable {
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
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).customSerializers();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).getFactoryConfig();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
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
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
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
    Object v22 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v22).widenContentsBy(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
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
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).getFactoryConfig();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v21).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v21).isPotentialBeanType(((java.lang.Class)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
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
  public void test46() throws Throwable {
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
  public void test47() throws Throwable {
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
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((java.lang.Class)v15).getDeclaredClasses();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).isPotentialBeanType(((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).getFactoryConfig();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v28 = java.util.Map.of(((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((java.util.Map)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v29).withAttribute(((java.lang.Object)v30),((java.lang.Object)v32));
    Object v34 = null;
    Object v35 = new java.lang.Object[]{};
    Object v36 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v35));
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).removeSetterlessGetters(((com.fasterxml.jackson.databind.SerializationConfig)v29),((com.fasterxml.jackson.databind.BeanDescription)v34),((java.util.List)v36));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
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
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v28));
    Object v30 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
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
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v21).constructBeanSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v22),((com.fasterxml.jackson.databind.BeanDescription)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10).serializerModifiers();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
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
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v26 = java.util.Map.of(((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v17).withAttributes(((java.util.Map)v26));
    Object v28 = null;
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v12));
    org.junit.Assert.assertNotNull(v13);
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
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10).serializerModifiers();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v12).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10).serializerModifiers();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = java.util.Map.of(((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((java.util.Map)v23));
    Object v25 = null;
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v12).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v24),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
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
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10).serializerModifiers();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v18));
    Object v20 = true;
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.type.TypeFactory)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v29),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v33 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v34 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v33));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31).writeTypeSuffixForScalar(((java.lang.Object)v32),((com.fasterxml.jackson.core.JsonGenerator)v34));
    Object v35 = null;
    Object v36 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v37 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v12).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JsonSerializer)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
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
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v21).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v22));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v34 = java.util.Map.of(((java.lang.Object)v26),((java.lang.Object)v27),((java.lang.Object)v28),((java.lang.Object)v29),((java.lang.Object)v30),((java.lang.Object)v31),((java.lang.Object)v32),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v24),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v25),((java.util.Map)v34));
    Object v36 = null;
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v21).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v35),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v12));
    Object v14 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v13).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).isPotentialBeanType(((java.lang.Class)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10).serializerModifiers();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v13 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v12).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
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
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isPrimitive();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v28 = java.util.Map.of(((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((java.util.Map)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = java.util.EnumSet.of(((java.lang.Enum)v31),((java.lang.Enum)v33));
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v34));
    Object v36 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v17).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v29),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v24 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v24));
    Object v26 = null;
    Object v27 = new java.lang.Object[]{};
    Object v28 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).filterBeanProperties(((com.fasterxml.jackson.databind.SerializationConfig)v25),((com.fasterxml.jackson.databind.BeanDescription)v26),((java.util.List)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v14).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v16 = null;
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v28));
    Object v30 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v14),((com.fasterxml.jackson.databind.JavaType)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = java.util.Map.of(((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((java.util.Map)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.JavaType)v26));
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
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v24 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v34 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.JsonSerializer)v33));
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
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v12).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v13));
    Object v14 = null;
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v33));
    Object v35 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.JavaType)v35));
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
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
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
    Object v22 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v23 = ((com.fasterxml.jackson.databind.SerializationConfig)v21).without(((com.fasterxml.jackson.core.JsonGenerator.Feature)v22));
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
    Object v38 = ((java.lang.reflect.Type)v37).getTypeName();
    Object v39 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v37));
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
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v13 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v10).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v11));
    Object v15 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v14).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v22));
    Object v24 = 1;
    Object v25 = new java.lang.StringBuilder((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v23).withTypeHandler(((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v16).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v23));
    ((com.fasterxml.jackson.databind.SerializerProvider)v8).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v27));
    Object v28 = null;
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v34));
    Object v36 = ((java.lang.reflect.Type)v35).getTypeName();
    Object v37 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v35));
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
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v17).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).isPotentialBeanType(((java.lang.Class)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v10 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).getFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v22 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v21).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v22));
    org.junit.Assert.assertNotNull(v23);
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
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10).serializerModifiers();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v13 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v17 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v15).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v14).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v15));
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v18).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v20).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v22).getFactoryConfig();
    Object v24 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v12).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
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
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v21));
    org.junit.Assert.assertNotNull(v22);
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
    Object v22 = null;
    Object v23 = new java.lang.Object[]{};
    Object v24 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v23));
    Object v25 = ((java.util.List)v24).spliterator();
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).removeIgnorableTypes(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.BeanDescription)v22),((java.util.List)v24));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
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
    Object v22 = null;
    ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).processViews(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.ser.BeanSerializerBuilder)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).customSerializers();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
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
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v14),((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v13).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v16),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v26 = java.util.Map.of(((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((java.util.Map)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v36 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v27),((com.fasterxml.jackson.databind.JavaType)v34),((com.fasterxml.jackson.databind.JsonSerializer)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v14 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v15).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v19).getFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10).serializerModifiers();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v13 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v12).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v17).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v16).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v17));
    Object v21 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v22 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v20).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v21));
    Object v23 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v24 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v22).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v23));
    Object v25 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v26 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v24).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v26).getFactoryConfig();
    Object v28 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v14).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
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
    Object v37 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6).serializerModifiers();
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
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
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
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
    Object v25 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
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
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v33));
    Object v35 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer();
    Object v37 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.JavaType)v35),((com.fasterxml.jackson.databind.JsonSerializer)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
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
    Object v30 = null;
    Object v31 = false;
    Object v32 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7)._createSerializer2(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.BeanDescription)v30),(((java.lang.Boolean)v31).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6).serializerModifiers();
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v8).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
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
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v1).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v2),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v14 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v15).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v19).getFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v34));
    Object v36 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = ((com.fasterxml.jackson.databind.ser.BeanSerializerFactory)v21).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v22),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
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
  public void test99() throws Throwable {
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
}
