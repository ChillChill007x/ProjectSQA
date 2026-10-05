package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0)._createObjectIdMap();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    Object v2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v3 = new java.lang.Class[]{null,null};
    Object v4 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v2),((java.lang.Class[])v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.BeanProperty)v4).getContextAnnotation(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v1),((com.fasterxml.jackson.databind.BeanProperty)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 1;
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).hasSerializationFeatures((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).getUnknownTypeSerializer(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = -17.0255872273428D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = "Cannot deserialize instance of %s out of %s token";
    Object v7 = "Current token not FIELD_NAME (to contain expected root name '%s'), but %s";
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).toString();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.BeanProperty)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = -17.0255872273428D;
    Object v8 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v7).doubleValue()));
    Object v9 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).hasSerializerFor(((java.lang.Class)v6),((java.util.concurrent.atomic.AtomicReference)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).getUnknownTypeSerializer(((java.lang.Class)v4));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).includeFilterSuppressNulls(((java.lang.Object)v2));
    Object v4 = 1;
    Object v5 = -36;
    Object v6 = 16;
    Object v7 = 1;
    Object v8 = 8;
    Object v9 = 32;
    Object v10 = new java.util.Date((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -17.0255872273428D;
    Object v12 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v11).doubleValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeDateValue(((java.util.Date)v10),((com.fasterxml.jackson.core.JsonGenerator)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v6),((java.lang.Class[])v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = ((com.fasterxml.jackson.databind.BeanProperty)v8).getContextAnnotation(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findNullKeySerializer(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.BeanProperty)v8));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = "[anySetter";
    Object v21 = "array";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.Class)v19),((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v28 = ((com.fasterxml.jackson.databind.DatabindContext)v2).objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v26),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = "[anySetter";
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v14),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = -17.0255872273428D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v7));
    Object v8 = null;
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v16 = new java.lang.Class[]{null,null};
    Object v17 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15),((java.lang.Class[])v16));
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findTypedValueSerializer(((com.fasterxml.jackson.databind.JavaType)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = -17.0255872273428D;
    Object v3 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v2).doubleValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeValue(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v9 = new java.lang.Class[]{null,null};
    Object v10 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((java.lang.Class[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findPrimaryPropertySerializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.BeanProperty)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v5),((java.lang.Class[])v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findPrimaryPropertySerializer(((java.lang.Class)v4),((com.fasterxml.jackson.databind.BeanProperty)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findValueSerializer(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DatabindContext)v0).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Class)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).findObjectId(((java.lang.Object)v12),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.core.type.ResolvedType)v5).toCanonical();
    Object v7 = "nmber";
    Object v8 = ((com.fasterxml.jackson.databind.DatabindContext)v0).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = "[anySetter";
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v14),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = "[anySetter";
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v2).objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v16),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((java.lang.Class)v4).getTypeParameters();
    Object v6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).getMetadata();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findPrimaryPropertySerializer(((java.lang.Class)v4),((com.fasterxml.jackson.databind.BeanProperty)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).flushCachedSerializers();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).includeFilterSuppressNulls(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).generateJsonSchema(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).includeFilterSuppressNulls(((java.lang.Object)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findValueSerializer(((java.lang.Class)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = -17.0255872273428D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v7),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = -17.0255872273428D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v11));
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v16));
    Object v18 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v7),((java.lang.Object)v12),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JsonSerializer)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    Object v2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v3 = new java.lang.Class[]{null,null};
    Object v4 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v2),((java.lang.Class[])v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v1),((com.fasterxml.jackson.databind.BeanProperty)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = -17.0255872273428D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v7),((java.lang.Object)v8),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    Object v2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v1),((com.fasterxml.jackson.databind.BeanProperty)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "[nullF";
    Object v8 = "";
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = -17.0255872273428D;
    Object v11 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v10).doubleValue()));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v16),((java.lang.Object)v18),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).copy();
    Object v3 = -17.0255872273428D;
    Object v4 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v3).doubleValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v9),((java.lang.Object)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 1;
    Object v2 = -36;
    Object v3 = 16;
    Object v4 = 1;
    Object v5 = 8;
    Object v6 = 32;
    Object v7 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -17.0255872273428D;
    Object v9 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v8).doubleValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v14).isClosed();
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeDateValue(((java.util.Date)v7),((com.fasterxml.jackson.core.JsonGenerator)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = ((java.lang.Class)v5).getClasses();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v8 = new java.lang.Class[]{null,null};
    Object v9 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v7),((java.lang.Class[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((java.lang.Class)v5),((com.fasterxml.jackson.databind.BeanProperty)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = -17.0255872273428D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).isContainerType();
    Object v15 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v7),((java.lang.Object)v8),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = ((java.lang.Class)v5).getComponentType();
    Object v7 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).generateJsonSchema(((java.lang.Class)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 0L;
    Object v2 = -17.0255872273428D;
    Object v3 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v2).doubleValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeDateKey((((java.lang.Long)v1).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = 19L;
    Object v5 = -17.0255872273428D;
    Object v6 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v5).doubleValue()));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v4).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v8 = new java.lang.Class[]{null,null};
    Object v9 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v7),((java.lang.Class[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findTypedValueSerializer(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Class)v10));
    Object v12 = -17.0255872273428D;
    Object v13 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v12).doubleValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
    Object v19 = 1;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v18).setFeatureMask((((java.lang.Integer)v19).intValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = -17.0255872273428D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeEndArray();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v15).getUnknownTypeSerializer(((java.lang.Class)v19));
    Object v21 = "array";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.type.TypeFactory)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v29 = "+";
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v27),((com.fasterxml.jackson.databind.BeanProperty)v28),((java.lang.String)v29));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).serializePolymorphic(((com.fasterxml.jackson.core.JsonGenerator)v7),((java.lang.Object)v9),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = "";
    Object v9 = ((com.fasterxml.jackson.databind.DatabindContext)v2).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = "[anySetter";
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v17 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = -17.0255872273428D;
    Object v3 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v2).doubleValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v8),((java.lang.Object)v9),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).findObjectId(((java.lang.Object)v4),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v6),((java.lang.Class[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findTypedValueSerializer(((java.lang.Class)v4),(((java.lang.Boolean)v5).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "q";
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = -46;
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).hasSerializationFeatures((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).includeFilterSuppressNulls(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).cachedSerializersCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = ">;";
    Object v8 = "";
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v11 = -17.0255872273428D;
    Object v12 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v11).doubleValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeValue(((java.lang.Object)v10),((com.fasterxml.jackson.core.JsonGenerator)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v9 = new java.lang.Class[]{null,null};
    Object v10 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((java.lang.Class[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findTypedValueSerializer(((com.fasterxml.jackson.databind.JavaType)v6),(((java.lang.Boolean)v7).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).includeFilterSuppressNulls(((java.lang.Object)v1));
    Object v3 = 9L;
    Object v4 = -17.0255872273428D;
    Object v5 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v4).doubleValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeDateKey((((java.lang.Long)v3).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getDefaultPropertyInclusion(((java.lang.Class)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = 1;
    Object v3 = -36;
    Object v4 = 16;
    Object v5 = 1;
    Object v6 = 8;
    Object v7 = 32;
    Object v8 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -17.0255872273428D;
    Object v10 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v9).doubleValue()));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue(((java.util.Date)v8),((com.fasterxml.jackson.core.JsonGenerator)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v8 = ((com.fasterxml.jackson.databind.BeanProperty)v7).getMetadata();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = 1;
    Object v3 = -36;
    Object v4 = 16;
    Object v5 = 1;
    Object v6 = 8;
    Object v7 = 32;
    Object v8 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -17.0255872273428D;
    Object v10 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v9).doubleValue()));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateKey(((java.util.Date)v8),((com.fasterxml.jackson.core.JsonGenerator)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = ((com.fasterxml.jackson.databind.BeanProperty)v7).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Class)v10));
    Object v12 = 0L;
    Object v13 = -17.0255872273428D;
    Object v14 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v13).doubleValue()));
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v12).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = ((java.lang.Class)v5).isEnum();
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getUnknownTypeSerializer(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getUnknownTypeSerializer(((java.lang.Class)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v13 = new java.lang.Class[]{null,null};
    Object v14 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((java.lang.Class[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findTypedValueSerializer(((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).copy();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = ((java.lang.Class)v7).isEnum();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v7));
    Object v10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v11 = ((com.fasterxml.jackson.databind.BeanProperty)v10).getType();
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 1L;
    Object v2 = -17.0255872273428D;
    Object v3 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v2).doubleValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v8).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v9));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeDateKey((((java.lang.Long)v1).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructType(((java.lang.reflect.Type)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getUnknownTypeSerializer(((java.lang.Class)v6));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).withTypeHandler(((java.lang.Object)v15));
    Object v17 = "items";
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).reportBadDefinition(((com.fasterxml.jackson.databind.JavaType)v13),((java.lang.String)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).getInterfaces();
    Object v8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.BeanProperty)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).getFilterProvider();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v0).constructType(((java.lang.reflect.Type)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getFilterProvider();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((java.lang.Class)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = "[anySetter";
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v2).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v16),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = ((java.lang.Class)v5).getEnclosingMethod();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v8 = new java.lang.Class[]{null,null};
    Object v9 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v7),((java.lang.Class[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((java.lang.Class)v5),((com.fasterxml.jackson.databind.BeanProperty)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).findObjectId(((java.lang.Object)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = ")";
    Object v7 = "requirFd";
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v9 = new java.lang.Class[]{null,null};
    Object v10 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((java.lang.Class[])v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = ((com.fasterxml.jackson.databind.BeanProperty)v10).getContextAnnotation(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).findNullKeySerializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.BeanProperty)v10));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).cachedSerializersCount();
    Object v6 = -17.0255872273428D;
    Object v7 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v6).doubleValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeValue(((java.lang.Object)v5),((com.fasterxml.jackson.core.JsonGenerator)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = -17.0255872273428D;
    Object v5 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v4).doubleValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = "array";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = new com.fasterxml.jackson.databind.ext.CoreXMLSerializers.XMLGregorianCalendarSerializer();
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v10),((java.lang.Object)v13),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JsonSerializer)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1)._createObjectIdMap();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = "[anySetter";
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v16 = ((com.fasterxml.jackson.databind.DatabindContext)v0).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v14),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).findObjectId(((java.lang.Object)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v4).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.Class)v13));
    Object v15 = "";
    Object v16 = ((com.fasterxml.jackson.databind.DatabindContext)v1).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v6),((java.lang.Class[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((java.lang.Class)v5),((com.fasterxml.jackson.databind.BeanProperty)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "getCallbacks";
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = -17.0255872273428D;
    Object v5 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v4).doubleValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeField(((java.lang.String)v2),((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((java.lang.Class)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = "array";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).includeFilterSuppressNulls(((java.lang.Object)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v13 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findTypedValueSerializer(((com.fasterxml.jackson.databind.JavaType)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v4).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v16 = new java.lang.Class[]{null,null};
    Object v17 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15),((java.lang.Class[])v16));
    Object v18 = ((com.fasterxml.jackson.databind.BeanProperty)v17).getMetadata();
    Object v19 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findNullKeySerializer(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.BeanProperty)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v6),((java.lang.Class[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findTypedValueSerializer(((java.lang.Class)v4),(((java.lang.Boolean)v5).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = -17.0255872273428D;
    Object v3 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v2).doubleValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = "[anySetter";
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = "array";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v8),((java.lang.Object)v22),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v0).copy();
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getDefaultNullKeySerializer();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = "])";
    Object v8 = ((com.fasterxml.jackson.databind.DatabindContext)v2).reportBadDefinition(((java.lang.Class)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = "array";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = java.util.EnumSet.of(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).getUnknownTypeSerializer(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = -17.0255872273428D;
    Object v8 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v7).doubleValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).defaultSerializeValue(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
