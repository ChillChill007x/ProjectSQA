package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
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
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "st";
    Object v9 = new java.lang.StringBuffer(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).serialize(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
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
  public void test6() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).getDelegatee();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.text.NumberFormat.getCurrencyInstance();
    ((java.text.DateFormat)v11).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
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
  public void test10() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = true;
    Object v12 = java.text.DateFormat.getDateTimeInstance();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v11),((java.text.DateFormat)v12));
    ((com.fasterxml.jackson.databind.SerializerProvider)v10).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v13));
    Object v14 = null;
    Object v15 = "', expected( ',' or '>')";
    Object v16 = " -Z";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "', expected( ',' or '>')";
    Object v20 = " -Z";
    Object v21 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = false;
    Object v25 = "]";
    Object v26 = 0;
    Object v27 = "'r";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v24).booleanValue()),((java.lang.String)v25),((java.lang.Integer)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.util.Calendar.getInstance();
    ((java.text.DateFormat)v11).setCalendar(((java.util.Calendar)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
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
  public void test14() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9)._timestamp(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.reflect.Type)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "N/A";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = 26L;
    Object v7 = 19L;
    Object v8 = 43;
    Object v9 = 31;
    Object v10 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = "]";
    Object v13 = 0;
    Object v14 = "'r";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v11).booleanValue()),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v4),((com.fasterxml.jackson.core.JsonLocation)v10),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = "]";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v18),((java.lang.Object)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
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
  public void test18() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "N/A";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = 26L;
    Object v7 = 19L;
    Object v8 = 43;
    Object v9 = 31;
    Object v10 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = "]";
    Object v13 = 0;
    Object v14 = "'r";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v11).booleanValue()),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v4),((com.fasterxml.jackson.core.JsonLocation)v10),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v18),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "N/A";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = 26L;
    Object v14 = 19L;
    Object v15 = 43;
    Object v16 = 31;
    Object v17 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = false;
    Object v19 = "]";
    Object v20 = 0;
    Object v21 = "'r";
    Object v22 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v18).booleanValue()),((java.lang.String)v19),((java.lang.Integer)v20),((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v11),((com.fasterxml.jackson.core.JsonLocation)v17),((java.lang.Object)v22),((java.lang.Class)v24));
    Object v26 = java.util.Calendar.getInstance();
    Object v27 = -31;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v25),((java.lang.Object)v26),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getUnknownTypeSerializer(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = 0;
    Object v4 = new java.text.FieldPosition((((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5),(((java.lang.Boolean)v6).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartArray();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = "', expected( ',' or '>')";
    Object v14 = " -Z";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "', expected( ',' or '>')";
    Object v18 = " -Z";
    Object v19 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = false;
    Object v23 = "]";
    Object v24 = 0;
    Object v25 = "'r";
    Object v26 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v22).booleanValue()),((java.lang.String)v23),((java.lang.Integer)v24),((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((com.fasterxml.jackson.databind.PropertyMetadata)v26));
    Object v28 = "iteger";
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12),((com.fasterxml.jackson.databind.BeanProperty)v27),((java.lang.String)v28));
    ((com.fasterxml.jackson.databind.ser.std.StdScalarSerializer)v2).serializeWithType(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = true;
    Object v5 = java.text.DateFormat.getDateTimeInstance();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v4),((java.text.DateFormat)v5));
    Object v7 = false;
    Object v8 = java.text.DateFormat.getDateTimeInstance();
    Object v9 = "EMAI_L";
    Object v10 = 0;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.DateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).withFormat(((java.lang.Boolean)v7),((java.text.DateFormat)v8));
    Object v14 = true;
    Object v15 = java.text.DateFormat.getDateTimeInstance();
    Object v16 = java.util.Calendar.getInstance();
    ((java.text.DateFormat)v15).setCalendar(((java.util.Calendar)v16));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v13).withFormat(((java.lang.Boolean)v14),((java.text.DateFormat)v15));
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v18));
    Object v19 = null;
    Object v20 = "N/A";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = 26L;
    Object v23 = 19L;
    Object v24 = 43;
    Object v25 = 31;
    Object v26 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v21),(((java.lang.Long)v22).longValue()),(((java.lang.Long)v23).longValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = "]";
    Object v29 = 0;
    Object v30 = "'r";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v27).booleanValue()),((java.lang.String)v28),((java.lang.Integer)v29),((java.lang.String)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v20),((com.fasterxml.jackson.core.JsonLocation)v26),((java.lang.Object)v31),((java.lang.Class)v33));
    Object v35 = java.util.Calendar.getInstance();
    Object v36 = "host-nameb";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v34),((java.lang.Object)v35),((java.lang.String)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = true;
    Object v9 = java.text.DateFormat.getDateTimeInstance();
    Object v10 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v8),((java.text.DateFormat)v9));
    ((com.fasterxml.jackson.databind.SerializerProvider)v7).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.util.Calendar.getInstance();
    ((java.text.DateFormat)v11).setCalendar(((java.util.Calendar)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = "', expected( ',' or '>')";
    Object v16 = " -Z";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "', expected( ',' or '>')";
    Object v20 = " -Z";
    Object v21 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = false;
    Object v25 = "]";
    Object v26 = 0;
    Object v27 = "'r";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v24).booleanValue()),((java.lang.String)v25),((java.lang.Integer)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).withFilterId(((java.lang.Object)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.text.NumberFormat.getCurrencyInstance();
    ((java.text.DateFormat)v11).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "N/A";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = 26L;
    Object v7 = 19L;
    Object v8 = 43;
    Object v9 = 31;
    Object v10 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = "]";
    Object v13 = 0;
    Object v14 = "'r";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v11).booleanValue()),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v4),((com.fasterxml.jackson.core.JsonLocation)v10),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = 19;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v18),((java.lang.Object)v19),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = 26L;
    Object v5 = 19L;
    Object v6 = 43;
    Object v7 = 31;
    Object v8 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).serialize(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
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
  public void test31() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).serialize(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 0;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).isEmpty(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v9).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9)._timestamp(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "AnnotationIntrospector returned Class ";
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).mappingException(((java.lang.String)v7),((java.lang.Object[])v8));
    Object v10 = "', expected( ',' or '>')";
    Object v11 = " -Z";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = "', expected( ',' or '>')";
    Object v15 = " -Z";
    Object v16 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = null;
    Object v19 = false;
    Object v20 = "]";
    Object v21 = 0;
    Object v22 = "'r";
    Object v23 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v19).booleanValue()),((java.lang.String)v20),((java.lang.Integer)v21),((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.util.Annotations)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18),((com.fasterxml.jackson.databind.PropertyMetadata)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.BeanProperty)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.util.Calendar.getInstance();
    ((java.text.DateFormat)v11).setCalendar(((java.util.Calendar)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = "', expected( ',' or '>')";
    Object v16 = " -Z";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "', expected( ',' or '>')";
    Object v20 = " -Z";
    Object v21 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = false;
    Object v25 = "]";
    Object v26 = 0;
    Object v27 = "'r";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v24).booleanValue()),((java.lang.String)v25),((java.lang.Integer)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).withFilterId(((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v30)._timestamp(((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4).expectNullFormat(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._timestamp(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = "]";
    Object v5 = 0;
    Object v6 = "'r";
    Object v7 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v3).booleanValue()),((java.lang.String)v4),((java.lang.Integer)v5),((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getUnknownTypeSerializer(((java.lang.Class)v9));
    Object v11 = "N/A";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = 26L;
    Object v14 = 19L;
    Object v15 = 43;
    Object v16 = 31;
    Object v17 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = false;
    Object v19 = "]";
    Object v20 = 0;
    Object v21 = "'r";
    Object v22 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v18).booleanValue()),((java.lang.String)v19),((java.lang.Integer)v20),((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v11),((com.fasterxml.jackson.core.JsonLocation)v17),((java.lang.Object)v22),((java.lang.Class)v24));
    Object v26 = ((java.lang.Throwable)v25).toString();
    Object v27 = -20L;
    Object v28 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v27).longValue()));
    Object v29 = "'";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v25),((java.lang.Object)v28),((java.lang.String)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = java.util.Calendar.getInstance();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._timestamp(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = -20L;
    Object v9 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v8).longValue()));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = true;
    Object v10 = java.text.DateFormat.getDateTimeInstance();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v9),((java.text.DateFormat)v10));
    ((com.fasterxml.jackson.databind.SerializerProvider)v8).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v11));
    Object v12 = null;
    Object v13 = "', expected( ',' or '>')";
    Object v14 = " -Z";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "', expected( ',' or '>')";
    Object v18 = " -Z";
    Object v19 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = false;
    Object v23 = "]";
    Object v24 = 0;
    Object v25 = "'r";
    Object v26 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v22).booleanValue()),((java.lang.String)v23),((java.lang.Integer)v24),((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((com.fasterxml.jackson.databind.PropertyMetadata)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.BeanProperty)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = "N/A";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = 26L;
    Object v15 = 19L;
    Object v16 = 43;
    Object v17 = 31;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = false;
    Object v20 = "]";
    Object v21 = 0;
    Object v22 = "'r";
    Object v23 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v19).booleanValue()),((java.lang.String)v20),((java.lang.Integer)v21),((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v12),((com.fasterxml.jackson.core.JsonLocation)v18),((java.lang.Object)v23),((java.lang.Class)v25));
    Object v27 = ((java.lang.Throwable)v26).toString();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.type.TypeFactory)v30));
    Object v32 = "";
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v31),((java.lang.String)v32),(((java.lang.Boolean)v33).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = 36;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.Throwable)v26),((java.lang.Object)v35),(((java.lang.Integer)v36).intValue()));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((java.lang.reflect.Type)v8).getTypeName();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = true;
    Object v5 = java.text.DateFormat.getDateTimeInstance();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v4),((java.text.DateFormat)v5));
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    Object v8 = "', expected( ',' or '>')";
    Object v9 = " -Z";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = "', expected( ',' or '>')";
    Object v13 = " -Z";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = null;
    Object v17 = false;
    Object v18 = "]";
    Object v19 = 0;
    Object v20 = "'r";
    Object v21 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v17).booleanValue()),((java.lang.String)v18),((java.lang.Integer)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((com.fasterxml.jackson.databind.PropertyMetadata)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.BeanProperty)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.util.Calendar.getInstance();
    ((java.text.DateFormat)v11).setCalendar(((java.util.Calendar)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = "', expected( ',' or '>')";
    Object v16 = " -Z";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "', expected( ',' or '>')";
    Object v20 = " -Z";
    Object v21 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = false;
    Object v25 = "]";
    Object v26 = 0;
    Object v27 = "'r";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v24).booleanValue()),((java.lang.String)v25),((java.lang.Integer)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).withFilterId(((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v30).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v31),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = false;
    Object v7 = "]";
    Object v8 = 0;
    Object v9 = "'r";
    Object v10 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.Integer)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._timestamp(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
    Object v8 = "', expected( ',' or '>')";
    Object v9 = " -Z";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = "', expected( ',' or '>')";
    Object v13 = " -Z";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = null;
    Object v17 = false;
    Object v18 = "]";
    Object v19 = 0;
    Object v20 = "'r";
    Object v21 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v17).booleanValue()),((java.lang.String)v18),((java.lang.Integer)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((com.fasterxml.jackson.databind.PropertyMetadata)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.BeanProperty)v22));
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
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = 53L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).serialize(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.text.NumberFormat.getCurrencyInstance();
    ((java.text.DateFormat)v11).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = false;
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).serialize(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "N/A";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = 26L;
    Object v7 = 19L;
    Object v8 = 43;
    Object v9 = 31;
    Object v10 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = "]";
    Object v13 = 0;
    Object v14 = "'r";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v11).booleanValue()),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v4),((com.fasterxml.jackson.core.JsonLocation)v10),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v20));
    Object v22 = 57;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v18),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).isEmpty(((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8).expectBooleanFormat(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.reflect.Type)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DatabindContext)v7).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.text.NumberFormat.getCurrencyInstance();
    ((java.text.DateFormat)v11).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.reflect.Type)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v19),((java.lang.reflect.Type)v21),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9)._timestamp(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8));
    Object v10 = "st";
    Object v11 = new java.lang.StringBuffer(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = false;
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = "Failed to instantiate class ";
    Object v17 = new java.lang.Object[]{null};
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v15).mappingException(((java.lang.String)v16),((java.lang.Object[])v17));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).serialize(((java.lang.Object)v11),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "N/A";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = 26L;
    Object v7 = 19L;
    Object v8 = 43;
    Object v9 = 31;
    Object v10 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = "]";
    Object v13 = 0;
    Object v14 = "'r";
    Object v15 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v11).booleanValue()),((java.lang.String)v12),((java.lang.Integer)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.exc.InvalidFormatException(((java.lang.String)v4),((com.fasterxml.jackson.core.JsonLocation)v10),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = true;
    Object v20 = java.text.DateFormat.getDateTimeInstance();
    Object v21 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v19),((java.text.DateFormat)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v21).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v22),((java.lang.reflect.Type)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = "G";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v18),((java.lang.Object)v26),((java.lang.String)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.util.Calendar.getInstance();
    ((java.text.DateFormat)v11).setCalendar(((java.util.Calendar)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = "', expected( ',' or '>')";
    Object v17 = " -Z";
    Object v18 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = "', expected( ',' or '>')";
    Object v21 = " -Z";
    Object v22 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = null;
    Object v25 = false;
    Object v26 = "]";
    Object v27 = 0;
    Object v28 = "'r";
    Object v29 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v25).booleanValue()),((java.lang.String)v26),((java.lang.Integer)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.util.Annotations)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((com.fasterxml.jackson.databind.PropertyMetadata)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v15),((com.fasterxml.jackson.databind.BeanProperty)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
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
    Object v8 = "', expected( ',' or '>')";
    Object v9 = " -Z";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = "', expected( ',' or '>')";
    Object v13 = " -Z";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = null;
    Object v17 = false;
    Object v18 = "]";
    Object v19 = 0;
    Object v20 = "'r";
    Object v21 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v17).booleanValue()),((java.lang.String)v18),((java.lang.Integer)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((com.fasterxml.jackson.databind.PropertyMetadata)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.BeanProperty)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._timestamp(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.util.Calendar.getInstance();
    ((java.text.DateFormat)v11).setCalendar(((java.util.Calendar)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = true;
    Object v17 = java.text.DateFormat.getDateTimeInstance();
    Object v18 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v16),((java.text.DateFormat)v17));
    Object v19 = ")";
    Object v20 = ")";
    Object v21 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v21));
    ((com.fasterxml.jackson.databind.SerializerProvider)v15).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v22));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.reflect.Type)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = 53L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._timestamp(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(53L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2)._timestamp(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = true;
    Object v16 = java.text.DateFormat.getDateTimeInstance();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v15),((java.text.DateFormat)v16));
    Object v18 = ")";
    Object v19 = ")";
    Object v20 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JsonSerializer)v17).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v20));
    Object v22 = ")";
    Object v23 = ")";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonSerializer)v21).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JsonSerializer)v10).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v25));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = true;
    Object v13 = java.text.DateFormat.getDateTimeInstance();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v12),((java.text.DateFormat)v13));
    Object v15 = true;
    Object v16 = java.text.DateFormat.getDateTimeInstance();
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).withFormat(((java.lang.Boolean)v15),((java.text.DateFormat)v16));
    ((com.fasterxml.jackson.databind.SerializerProvider)v11).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v18 = null;
    Object v19 = "', expected( ',' or '>')";
    Object v20 = " -Z";
    Object v21 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = "', expected( ',' or '>')";
    Object v24 = " -Z";
    Object v25 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = null;
    Object v28 = false;
    Object v29 = "]";
    Object v30 = 0;
    Object v31 = "'r";
    Object v32 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v28).booleanValue()),((java.lang.String)v29),((java.lang.Integer)v30),((java.lang.String)v31));
    Object v33 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.PropertyName)v25),((com.fasterxml.jackson.databind.util.Annotations)v26),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((com.fasterxml.jackson.databind.PropertyMetadata)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.BeanProperty)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10)._timestamp(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).isEmpty(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.reflect.Type)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.text.NumberFormat.getCurrencyInstance();
    ((java.text.DateFormat)v11).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.reflect.Type)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = java.text.DateFormat.getDateTimeInstance();
    Object v21 = true;
    ((java.text.DateFormat)v20).setLenient((((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).withFormat(((java.lang.Boolean)v19),((java.text.DateFormat)v20));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.text.NumberFormat.getCurrencyInstance();
    ((java.text.DateFormat)v11).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.reflect.Type)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = java.text.DateFormat.getDateTimeInstance();
    Object v21 = true;
    ((java.text.DateFormat)v20).setLenient((((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).withFormat(((java.lang.Boolean)v19),((java.text.DateFormat)v20));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = true;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v23)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v25),((com.fasterxml.jackson.databind.JavaType)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = "o";
    Object v21 = new java.lang.Object[]{null,null,null};
    Object v22 = ((com.fasterxml.jackson.databind.SerializerProvider)v19).mappingException(((java.lang.String)v20),((java.lang.Object[])v21));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10).serialize(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v18),((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = ")=";
    Object v13 = new java.lang.Object[]{};
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v11).mappingException(((java.lang.String)v12),((java.lang.Object[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.reflect.Type)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = true;
    Object v8 = java.text.DateFormat.getDateTimeInstance();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).withFormat(((java.lang.Boolean)v7),((java.text.DateFormat)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = 53L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.Object)v13));
    Object v15 = -20L;
    Object v16 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v15).longValue()));
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10)._timestamp(((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v10).properties();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = "EMAI_L";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v10 = true;
    Object v11 = java.text.DateFormat.getDateTimeInstance();
    Object v12 = java.util.Calendar.getInstance();
    ((java.text.DateFormat)v11).setCalendar(((java.util.Calendar)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v11));
    Object v15 = "', expected( ',' or '>')";
    Object v16 = " -Z";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "', expected( ',' or '>')";
    Object v20 = " -Z";
    Object v21 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = false;
    Object v25 = "]";
    Object v26 = 0;
    Object v27 = "'r";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v24).booleanValue()),((java.lang.String)v25),((java.lang.Integer)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).withFilterId(((java.lang.Object)v29));
    Object v31 = true;
    Object v32 = java.text.DateFormat.getDateTimeInstance();
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v30).withFormat(((java.lang.Boolean)v31),((java.text.DateFormat)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v35).expectStringFormat(((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v30).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v35),((com.fasterxml.jackson.databind.JavaType)v38));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = -20L;
    Object v8 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v7).longValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._timestamp(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = ")";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = "', expected( ',' or '>')";
    Object v13 = " -Z";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = "', expected( ',' or '>')";
    Object v17 = " -Z";
    Object v18 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = null;
    Object v21 = false;
    Object v22 = "]";
    Object v23 = 0;
    Object v24 = "'r";
    Object v25 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v21).booleanValue()),((java.lang.String)v22),((java.lang.Integer)v23),((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((com.fasterxml.jackson.databind.PropertyMetadata)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v10).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.BeanProperty)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = false;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = true;
    Object v4 = java.text.DateFormat.getDateTimeInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v2).withFormat(((java.lang.Boolean)v3),((java.text.DateFormat)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = true;
    Object v1 = java.text.DateFormat.getDateTimeInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v1));
    Object v3 = ")";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = true;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v6)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }
}
