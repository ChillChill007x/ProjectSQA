package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "]";
    Object v10 = new java.util.TreeMap();
    Object v11 = 2L;
    Object v12 = -11L;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "number";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v9),((com.fasterxml.jackson.core.JsonLocation)v15),((java.lang.Object)v17),((java.lang.Class)v20));
    Object v22 = "]";
    Object v23 = new java.util.TreeMap();
    Object v24 = 2L;
    Object v25 = -11L;
    Object v26 = 0;
    Object v27 = 0;
    Object v28 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v23),(((java.lang.Long)v24).longValue()),(((java.lang.Long)v25).longValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "number";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v32));
    Object v34 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v22),((com.fasterxml.jackson.core.JsonLocation)v28),((java.lang.Object)v30),((java.lang.Class)v33));
    Object v35 = ((java.lang.Throwable)v21).initCause(((java.lang.Throwable)v34));
    Object v36 = new java.util.TreeMap();
    Object v37 = -1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v21),((java.lang.Object)v36),(((java.lang.Integer)v37).intValue()));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new java.util.TreeMap();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNull();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v10).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v11));
    Object v12 = null;
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v16 = 18;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "]";
    Object v2 = "strXng";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = "number";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "number";
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = "]";
    Object v18 = "strXng";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = "number";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v28));
    Object v30 = "Trying to resolve a foward reference with id [";
    Object v31 = "number";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26),((java.lang.Class)v29),((java.lang.String)v30),((java.lang.Class)v33));
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v12),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34),(((java.lang.Boolean)v35).booleanValue()));
    Object v37 = "not a v";
    Object v38 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((com.fasterxml.jackson.databind.BeanProperty)v36),((java.lang.String)v37));
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).serializeWithType(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v20),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).serialize(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonGenerator)v10).getCurrentValue();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v12).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v13));
    Object v14 = null;
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = -22;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = "any";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = "number";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).serialize(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = " vs ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = "]...[";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "]";
    Object v10 = new java.util.TreeMap();
    Object v11 = 2L;
    Object v12 = -11L;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "number";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v9),((com.fasterxml.jackson.core.JsonLocation)v15),((java.lang.Object)v17),((java.lang.Class)v20));
    Object v22 = "]";
    Object v23 = new java.util.TreeMap();
    Object v24 = 2L;
    Object v25 = -11L;
    Object v26 = 0;
    Object v27 = 0;
    Object v28 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v23),(((java.lang.Long)v24).longValue()),(((java.lang.Long)v25).longValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "number";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v32));
    Object v34 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v22),((com.fasterxml.jackson.core.JsonLocation)v28),((java.lang.Object)v30),((java.lang.Class)v33));
    Object v35 = ((java.lang.Throwable)v21).initCause(((java.lang.Throwable)v34));
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = "object";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v21),((java.lang.Object)v36),((java.lang.String)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = "]";
    Object v16 = "strXng";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "Internal error: entry should be a";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v16 = 31;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).handledType();
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = "]";
    Object v2 = "strXng";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new java.util.TreeMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "]";
    Object v9 = new java.util.TreeMap();
    Object v10 = 2L;
    Object v11 = -11L;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v8),((com.fasterxml.jackson.core.JsonLocation)v14),((java.lang.Object)v16),((java.lang.Class)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v20),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v1));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = new java.util.TreeMap();
    Object v16 = 2L;
    Object v17 = -11L;
    Object v18 = 0;
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v15),(((java.lang.Long)v16).longValue()),(((java.lang.Long)v17).longValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).isEmpty(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).serialize(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10));
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v11));
    Object v12 = null;
    Object v13 = "]";
    Object v14 = new java.util.TreeMap();
    Object v15 = 2L;
    Object v16 = -11L;
    Object v17 = 0;
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v13),((com.fasterxml.jackson.core.JsonLocation)v19),((java.lang.Object)v21),((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Throwable)v25),((java.lang.Object)v26),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "]";
    Object v7 = new java.util.TreeMap();
    Object v8 = 2L;
    Object v9 = -11L;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v6),((com.fasterxml.jackson.core.JsonLocation)v12),((java.lang.Object)v14),((java.lang.Class)v17));
    Object v19 = "]";
    Object v20 = new java.util.TreeMap();
    Object v21 = 2L;
    Object v22 = -11L;
    Object v23 = 0;
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v20),(((java.lang.Long)v21).longValue()),(((java.lang.Long)v22).longValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "number";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "number";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v29));
    Object v31 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v19),((com.fasterxml.jackson.core.JsonLocation)v25),((java.lang.Object)v27),((java.lang.Class)v30));
    Object v32 = 16;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v18),((java.lang.Object)v31),(((java.lang.Integer)v32).intValue()));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v9),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v5),((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = "]";
    Object v16 = "strXng";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "initC$use";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).isEmpty(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "number";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = -20;
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = 75;
    Object v9 = 29;
    Object v10 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v10),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = "]";
    Object v5 = new java.util.TreeMap();
    Object v6 = 2L;
    Object v7 = -11L;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v4),((com.fasterxml.jackson.core.JsonLocation)v10),((java.lang.Object)v12),((java.lang.Class)v15));
    Object v17 = "]";
    Object v18 = "strXng";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = 30;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v16),((java.lang.Object)v19),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = 70;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).serialize(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "]";
    Object v9 = new java.util.TreeMap();
    Object v10 = 2L;
    Object v11 = -11L;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v8),((com.fasterxml.jackson.core.JsonLocation)v14),((java.lang.Object)v16),((java.lang.Class)v19));
    Object v21 = new java.util.TreeMap();
    Object v22 = 2L;
    Object v23 = -11L;
    Object v24 = 0;
    Object v25 = 0;
    Object v26 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v21),(((java.lang.Long)v22).longValue()),(((java.lang.Long)v23).longValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = "ANY";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v20),((java.lang.Object)v26),((java.lang.String)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new java.util.TreeMap();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v6 = ")";
    Object v7 = "items";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v9));
    Object v10 = null;
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = "]";
    Object v2 = "strXng";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "number";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v10),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v16 = "]";
    Object v17 = "strXng";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.databind.AnnotationIntrospector)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isEmpty(((java.lang.Object)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v22),((com.fasterxml.jackson.core.JsonGenerator)v24),((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = "number";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = "Trying to resolve a foward reference with id [";
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v11),((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = "number";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.reflect.Type)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "]";
    Object v8 = new java.util.TreeMap();
    Object v9 = 2L;
    Object v10 = -11L;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v13),((java.lang.Object)v15),((java.lang.Class)v18));
    ((java.lang.Throwable)v19).printStackTrace();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v22 = "]";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v19),((java.lang.Object)v21),((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).getDelegatee();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v16 = "]";
    Object v17 = "strXng";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isEmpty(((java.lang.Object)v18));
    Object v20 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v19),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = "number";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v11));
    Object v13 = ((java.lang.reflect.Type)v12).getTypeName();
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.reflect.Type)v12),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 70;
    Object v6 = new java.text.ParsePosition((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12));
    ((com.fasterxml.jackson.databind.SerializerProvider)v11).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.reflect.Type)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v16 = new java.util.TreeMap();
    Object v17 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isEmpty(((java.lang.Object)v16));
    Object v18 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "]";
    Object v9 = new java.util.TreeMap();
    Object v10 = 2L;
    Object v11 = -11L;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v8),((com.fasterxml.jackson.core.JsonLocation)v14),((java.lang.Object)v16),((java.lang.Class)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v23 = ((com.fasterxml.jackson.databind.JsonSerializer)v21).isEmpty(((java.lang.Object)v22));
    Object v24 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v20),((java.lang.Object)v23),(((java.lang.Integer)v24).intValue()));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).usesObjectId();
    Object v17 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = 70;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = 70;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = "Simple types have no content types;";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).isEmpty(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).usesObjectId();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).serialize(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = "number";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v4).getCodec();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "]";
    Object v8 = new java.util.TreeMap();
    Object v9 = 2L;
    Object v10 = -11L;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "number";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v13),((java.lang.Object)v15),((java.lang.Class)v18));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = 6;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v19),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).isEmpty(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).serialize(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
    Object v8 = new java.util.TreeMap();
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "]";
    Object v7 = new java.util.TreeMap();
    Object v8 = 2L;
    Object v9 = -11L;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v6),((com.fasterxml.jackson.core.JsonLocation)v12),((java.lang.Object)v14),((java.lang.Class)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = ((com.fasterxml.jackson.databind.JsonSerializer)v19).isEmpty(((java.lang.Object)v20));
    Object v22 = "strin=";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v18),((java.lang.Object)v21),((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "number";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "]";
    Object v11 = "strXng";
    Object v12 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = "item5s";
    ((com.fasterxml.jackson.core.JsonGenerator)v17).writeObjectFieldStart(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "]";
    Object v7 = new java.util.TreeMap();
    Object v8 = 2L;
    Object v9 = -11L;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v6),((com.fasterxml.jackson.core.JsonLocation)v12),((java.lang.Object)v14),((java.lang.Class)v17));
    Object v19 = new java.util.TreeMap();
    Object v20 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v18),((java.lang.Object)v19),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "]";
    Object v10 = new java.util.TreeMap();
    Object v11 = 2L;
    Object v12 = -11L;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "number";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v9),((com.fasterxml.jackson.core.JsonLocation)v15),((java.lang.Object)v17),((java.lang.Class)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = "number";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = false;
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v31 = "number";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v30),((java.lang.reflect.Type)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = "s`ring";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v21),((java.lang.Object)v35),((java.lang.String)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "]";
    Object v7 = new java.util.TreeMap();
    Object v8 = 2L;
    Object v9 = -11L;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v6),((com.fasterxml.jackson.core.JsonLocation)v12),((java.lang.Object)v14),((java.lang.Class)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v22 = ((com.fasterxml.jackson.databind.JsonSerializer)v20).isEmpty(((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JsonSerializer)v19).isEmpty(((java.lang.Object)v22));
    Object v24 = "string";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v18),((java.lang.Object)v23),((java.lang.String)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "number";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).usesObjectId();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "]";
    Object v9 = new java.util.TreeMap();
    Object v10 = 2L;
    Object v11 = -11L;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v8),((com.fasterxml.jackson.core.JsonLocation)v14),((java.lang.Object)v16),((java.lang.Class)v19));
    Object v21 = ((java.lang.Throwable)v20).toString();
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v20),((java.lang.Object)v23),((java.lang.String)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((java.lang.Object)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).isEmpty(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v5),((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "]";
    Object v6 = "strXng";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v9),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "]";
    Object v10 = new java.util.TreeMap();
    Object v11 = 2L;
    Object v12 = -11L;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "number";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v9),((com.fasterxml.jackson.core.JsonLocation)v15),((java.lang.Object)v17),((java.lang.Class)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "Can not find a Value deserializer for type ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v21),((java.lang.Object)v23),((java.lang.String)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v12 = ")";
    Object v13 = "items";
    Object v14 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v11).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v14));
    Object v16 = "number";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isEmpty(((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    ((com.fasterxml.jackson.core.JsonGenerator)v20).setCurrentValue(((java.lang.Object)v26));
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v4).serialize(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "]";
    Object v3 = new java.util.TreeMap();
    Object v4 = 2L;
    Object v5 = -11L;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v2),((com.fasterxml.jackson.core.JsonLocation)v8),((java.lang.Object)v10),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v15).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.reflect.Type)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 10;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v14),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = "number";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdKeySerializer)v0).serialize(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = "number";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v1 = ")";
    Object v2 = "items";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).isEmpty(((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v9),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = "]";
    Object v14 = new java.util.TreeMap();
    Object v15 = 2L;
    Object v16 = -11L;
    Object v17 = 0;
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = "number";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v13),((com.fasterxml.jackson.core.JsonLocation)v19),((java.lang.Object)v21),((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = ((com.fasterxml.jackson.databind.JsonSerializer)v26).isEmpty(((java.lang.Object)v27));
    Object v29 = 2;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.Throwable)v25),((java.lang.Object)v28),(((java.lang.Integer)v29).intValue()));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
