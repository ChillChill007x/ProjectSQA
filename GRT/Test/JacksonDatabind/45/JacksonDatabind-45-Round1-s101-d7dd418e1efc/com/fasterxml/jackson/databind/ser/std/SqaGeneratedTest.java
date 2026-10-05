package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = ", field(s)";
    Object v9 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "";
    Object v14 = "Can not construct Si";
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeStringField(((java.lang.String)v13),((java.lang.String)v14));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).serialize(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "[aySetter]";
    Object v8 = "";
    Object v9 = ", field(s)";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 1L;
    Object v12 = 1L;
    Object v13 = 1;
    Object v14 = -20;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v6),((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v15));
    Object v17 = "";
    Object v18 = ", field(s)";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = 1L;
    Object v21 = 1L;
    Object v22 = 1;
    Object v23 = -20;
    Object v24 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v19),(((java.lang.Long)v20).longValue()),(((java.lang.Long)v21).longValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = "' (type";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v16),((java.lang.Object)v24),((java.lang.String)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = "[aySetter]";
    Object v15 = "";
    Object v16 = ", field(s)";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 1L;
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = -20;
    Object v22 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v13),((java.lang.String)v14),((com.fasterxml.jackson.core.JsonLocation)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = "sting";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v23),((java.lang.Object)v24),((java.lang.String)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v14),((java.lang.reflect.Type)v15),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ")4";
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = "";
    Object v8 = ", field(s)";
    Object v9 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.BeanProperty)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._timestamp(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v10),((com.fasterxml.jackson.databind.JavaType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = 0;
    Object v4 = new java.text.FieldPosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((java.lang.reflect.Type)v8).getTypeName();
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "";
    Object v5 = ", field(s)";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.util.Annotations)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v13),((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.BeanProperty)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).getDelegatee();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v5).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = java.text.DateFormat.getDateTimeInstance();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v9),((java.text.DateFormat)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v14),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = "[aySetter]";
    Object v12 = "";
    Object v13 = ", field(s)";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = 1L;
    Object v16 = 1L;
    Object v17 = 1;
    Object v18 = -20;
    Object v19 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v10),((java.lang.String)v11),((com.fasterxml.jackson.core.JsonLocation)v19));
    Object v21 = java.io.OutputStream.nullOutputStream();
    Object v22 = false;
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintWriter(((java.io.OutputStream)v21),(((java.lang.Boolean)v22).booleanValue()),((java.nio.charset.Charset)v23));
    Object v25 = true;
    Object v26 = new java.io.PrintWriter(((java.io.Writer)v24),(((java.lang.Boolean)v25).booleanValue()));
    ((java.lang.Throwable)v20).printStackTrace(((java.io.PrintWriter)v26));
    Object v27 = null;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = 12;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v20),((java.lang.Object)v28),(((java.lang.Integer)v29).intValue()));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = true;
    Object v8 = java.text.DateFormat.getDateTimeInstance();
    Object v9 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v7),((java.text.DateFormat)v8));
    ((com.fasterxml.jackson.databind.SerializerProvider)v6).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v9));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "NUMBER";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v3));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).serialize(((java.lang.Object)v5),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = "[aySetter]";
    Object v15 = "";
    Object v16 = ", field(s)";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 1L;
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = -20;
    Object v22 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v13),((java.lang.String)v14),((com.fasterxml.jackson.core.JsonLocation)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = "]";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v23),((java.lang.Object)v24),((java.lang.String)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = false;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = -28L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((java.text.DateFormat)v11).format(((java.util.Date)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = -28L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._timestamp(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "i";
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = "[aySetter]";
    Object v11 = "";
    Object v12 = ", field(s)";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = 1L;
    Object v15 = 1L;
    Object v16 = 1;
    Object v17 = -20;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v9),((java.lang.String)v10),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v19),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v5).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = -28L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
    Object v8 = "com.faterxml.jackson.databind.ext.PathDeserializer";
    Object v9 = new java.lang.StringBuffer(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).serialize(((java.lang.Object)v14),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._timestamp(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = 0;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._timestamp(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = "[aySetter]";
    Object v15 = "";
    Object v16 = ", field(s)";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 1L;
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = -20;
    Object v22 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v13),((java.lang.String)v14),((com.fasterxml.jackson.core.JsonLocation)v22));
    Object v24 = "";
    Object v25 = ", field(s)";
    Object v26 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = "}";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v23),((java.lang.Object)v26),((java.lang.String)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v9).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "NUMBER";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = "[aySetter]";
    Object v15 = "";
    Object v16 = ", field(s)";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 1L;
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = -20;
    Object v22 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v13),((java.lang.String)v14),((com.fasterxml.jackson.core.JsonLocation)v22));
    Object v24 = true;
    Object v25 = java.text.DateFormat.getDateTimeInstance();
    Object v26 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v24),((java.text.DateFormat)v25));
    Object v27 = true;
    Object v28 = java.text.DateFormat.getDateTimeInstance();
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v26).withFormat(((java.lang.Boolean)v27),((java.text.DateFormat)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v29)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v32 = 14;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v23),((java.lang.Object)v31),(((java.lang.Integer)v32).intValue()));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "[aySetter]";
    Object v8 = "";
    Object v9 = ", field(s)";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 1L;
    Object v12 = 1L;
    Object v13 = 1;
    Object v14 = -20;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v6),((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v15));
    Object v17 = 0;
    Object v18 = new java.text.FieldPosition((((java.lang.Integer)v17).intValue()));
    Object v19 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v16),((java.lang.Object)v18),((java.lang.String)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9)._timestamp(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "";
    Object v12 = ", field(s)";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = "[aySetter]";
    Object v15 = "";
    Object v16 = ", field(s)";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 1L;
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = -20;
    Object v22 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v13),((java.lang.String)v14),((com.fasterxml.jackson.core.JsonLocation)v22));
    Object v24 = "NUMBER";
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v24));
    Object v26 = "NUMBER";
    Object v27 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v23),((java.lang.Object)v29),(((java.lang.Integer)v30).intValue()));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "NUMBER";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "";
    Object v13 = ", field(s)";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).serialize(((java.lang.Object)v14),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = false;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = -28L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((java.text.DateFormat)v11).format(((java.util.Date)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = -28L;
    Object v18 = new java.util.Date((((java.lang.Long)v17).longValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = false;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = -28L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((java.text.DateFormat)v11).format(((java.util.Date)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = false;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = -28L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((java.text.DateFormat)v11).format(((java.util.Date)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v16 = false;
    Object v17 = java.text.DateFormat.getDateTimeInstance();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15).withFormat(((java.lang.Boolean)v16),((java.text.DateFormat)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isConcrete();
    Object v6 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = false;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = -28L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((java.text.DateFormat)v11).format(((java.util.Date)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = "";
    Object v21 = ", field(s)";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 0;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.type.TypeFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v19),((com.fasterxml.jackson.databind.BeanProperty)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "[aySetter]";
    Object v8 = "";
    Object v9 = ", field(s)";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 1L;
    Object v12 = 1L;
    Object v13 = 1;
    Object v14 = -20;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v6),((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v15));
    Object v17 = 0;
    Object v18 = new java.text.FieldPosition((((java.lang.Integer)v17).intValue()));
    Object v19 = 9;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v16),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = "[aySetter]";
    Object v11 = "";
    Object v12 = ", field(s)";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = 1L;
    Object v15 = 1L;
    Object v16 = 1;
    Object v17 = -20;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v9),((java.lang.String)v10),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = -62;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v19),((java.lang.Object)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "[aySetter]";
    Object v8 = "";
    Object v9 = ", field(s)";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 1L;
    Object v12 = 1L;
    Object v13 = 1;
    Object v14 = -20;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v6),((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v15));
    Object v17 = "";
    Object v18 = ", field(s)";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v16),((java.lang.Object)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isContainerType();
    Object v6 = true;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v7).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = "[aySetter]";
    Object v16 = "";
    Object v17 = ", field(s)";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = 1L;
    Object v20 = 1L;
    Object v21 = 1;
    Object v22 = -20;
    Object v23 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v18),(((java.lang.Long)v19).longValue()),(((java.lang.Long)v20).longValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v14),((java.lang.String)v15),((com.fasterxml.jackson.core.JsonLocation)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.type.TypeFactory)v26));
    Object v28 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v24),((java.lang.Object)v27),(((java.lang.Integer)v28).intValue()));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = false;
    Object v8 = java.text.DateFormat.getDateTimeInstance();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).withFormat(((java.lang.Boolean)v7),((java.text.DateFormat)v8));
    Object v10 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = true;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v10),((com.fasterxml.jackson.databind.JavaType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = true;
    Object v5 = java.text.DateFormat.getDateTimeInstance();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v4),((java.text.DateFormat)v5));
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = "com.faterxml.jackson.databind.ext.PathDeserializer";
    Object v8 = new java.lang.StringBuffer(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = ", field(s)";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),((java.lang.Object)v28));
    Object v30 = "O^jectIdInfo: propName=";
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v29),((java.lang.String)v30));
    Object v32 = -28L;
    Object v33 = new java.util.Date((((java.lang.Long)v32).longValue()));
    Object v34 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v34),(((java.lang.Boolean)v35).booleanValue()));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31).writeTypePrefixForArray(((java.lang.Object)v33),((com.fasterxml.jackson.core.JsonGenerator)v36));
    Object v37 = null;
    ((com.fasterxml.jackson.databind.ser.std.StdScalarSerializer)v6).serializeWithType(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = true;
    Object v9 = java.text.DateFormat.getDateTimeInstance();
    Object v10 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v8),((java.text.DateFormat)v9));
    ((com.fasterxml.jackson.databind.SerializerProvider)v7).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = ", field(s)";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.type.TypeFactory)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v27));
    Object v29 = "O^jectIdInfo: propName=";
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v28),((java.lang.String)v29));
    ((com.fasterxml.jackson.databind.ser.std.StdScalarSerializer)v2).serializeWithType(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = false;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = -28L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((java.text.DateFormat)v11).format(((java.util.Date)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v16 = false;
    Object v17 = java.text.DateFormat.getDateTimeInstance();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15).withFormat(((java.lang.Boolean)v16),((java.text.DateFormat)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).properties();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = "[aySetter]";
    Object v15 = "";
    Object v16 = ", field(s)";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = 1L;
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = -20;
    Object v22 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v13),((java.lang.String)v14),((com.fasterxml.jackson.core.JsonLocation)v22));
    Object v24 = 0;
    Object v25 = new java.text.FieldPosition((((java.lang.Integer)v24).intValue()));
    Object v26 = "AnnotationIntrospector returned Cla";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v23),((java.lang.Object)v25),((java.lang.String)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = "[aySetter]";
    Object v12 = "";
    Object v13 = ", field(s)";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = 1L;
    Object v16 = 1L;
    Object v17 = 1;
    Object v18 = -20;
    Object v19 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v10),((java.lang.String)v11),((com.fasterxml.jackson.core.JsonLocation)v19));
    Object v21 = java.io.OutputStream.nullOutputStream();
    Object v22 = false;
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintWriter(((java.io.OutputStream)v21),(((java.lang.Boolean)v22).booleanValue()),((java.nio.charset.Charset)v23));
    Object v25 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v20),((java.lang.Object)v24),((java.lang.String)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "[aySetter]";
    Object v8 = "";
    Object v9 = ", field(s)";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = 1L;
    Object v12 = 1L;
    Object v13 = 1;
    Object v14 = -20;
    Object v15 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v6),((java.lang.String)v7),((com.fasterxml.jackson.core.JsonLocation)v15));
    Object v17 = "";
    Object v18 = ", field(s)";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "'string";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v16),((java.lang.Object)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "";
    Object v4 = ", field(s)";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = 1L;
    Object v7 = 1L;
    Object v8 = 1;
    Object v9 = -20;
    Object v10 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = true;
    Object v7 = java.text.DateFormat.getDateTimeInstance();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).withFormat(((java.lang.Boolean)v6),((java.text.DateFormat)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).serialize(((java.lang.Object)v11),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = "doule";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).properties();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v9).getDelegatee();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = "[aySetter]";
    Object v11 = "";
    Object v12 = ", field(s)";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = 1L;
    Object v15 = 1L;
    Object v16 = 1;
    Object v17 = -20;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v9),((java.lang.String)v10),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = -28L;
    Object v21 = new java.util.Date((((java.lang.Long)v20).longValue()));
    Object v22 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v19),((java.lang.Object)v21),((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "NUMBER";
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "s_et";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = false;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = -28L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((java.text.DateFormat)v11).format(((java.util.Date)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.reflect.Type)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15).isEmpty(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "";
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = "doule";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).isEmpty(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = "doule";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = "[aySetter]";
    Object v12 = "";
    Object v13 = ", field(s)";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = 1L;
    Object v16 = 1L;
    Object v17 = 1;
    Object v18 = -20;
    Object v19 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v10),((java.lang.String)v11),((com.fasterxml.jackson.core.JsonLocation)v19));
    Object v21 = "NUMBER";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = 14;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v20),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = "[aySetter]";
    Object v20 = "";
    Object v21 = ", field(s)";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = 1L;
    Object v24 = 1L;
    Object v25 = 1;
    Object v26 = -20;
    Object v27 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v22),(((java.lang.Long)v23).longValue()),(((java.lang.Long)v24).longValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = new com.fasterxml.jackson.databind.JsonMappingException(((java.io.Closeable)v18),((java.lang.String)v19),((com.fasterxml.jackson.core.JsonLocation)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = -35;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.Throwable)v28),((java.lang.Object)v29),(((java.lang.Integer)v30).intValue()));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).isEmpty(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "";
    Object v8 = ", field(s)";
    Object v9 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.BeanProperty)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = "doule";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v13 = true;
    Object v14 = java.text.DateFormat.getDateTimeInstance();
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v12).withFormat(((java.lang.Boolean)v13),((java.text.DateFormat)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).isInterface();
    Object v9 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v6),((com.fasterxml.jackson.databind.JavaType)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = "doule";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).serialize(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = false;
    Object v17 = java.text.DateFormat.getDateTimeInstance();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).withFormat(((java.lang.Boolean)v16),((java.text.DateFormat)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).withFilterId(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5)._timestamp(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = "doule";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = true;
    Object v8 = java.text.DateFormat.getDateTimeInstance();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).withFormat(((java.lang.Boolean)v7),((java.text.DateFormat)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = true;
    Object v12 = java.text.DateFormat.getDateTimeInstance();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v11),((java.text.DateFormat)v12));
    Object v14 = "doule";
    Object v15 = "]";
    Object v16 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonSerializer)v13).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v19));
    Object v21 = "NUMBER";
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeType.valueOf(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v17).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.reflect.Type)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = false;
    Object v28 = java.text.DateFormat.getDateTimeInstance();
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v17).withFormat(((java.lang.Boolean)v27),((java.text.DateFormat)v28));
    ((com.fasterxml.jackson.databind.SerializerProvider)v10).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v29));
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }
}
