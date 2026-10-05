package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = false;
    Object v9 = 0;
    Object v10 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).withFormat(((java.lang.Boolean)v8),((java.text.DateFormat)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._timestamp(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v10).isTypeOrSuperTypeOf(((java.lang.Class)v13));
    Object v15 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v10),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = "]";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v13));
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = "unable to[parse key as Class";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Throwable)v14),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.util.Map.of();
    Object v8 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v6),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonGenerator)v10).getFeatureMask();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).getUnknownTypeSerializer(((java.lang.Class)v16));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).serialize(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v13));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = "]";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v11 = 18;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v9),((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0;
    Object v12 = 29;
    Object v13 = -23;
    Object v14 = 0;
    Object v15 = -53;
    Object v16 = 9;
    Object v17 = new java.util.Date((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = 29;
    Object v20 = -23;
    Object v21 = 0;
    Object v22 = -53;
    Object v23 = 9;
    Object v24 = new java.util.Date((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((java.util.Date)v17).after(((java.util.Date)v24));
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = java.util.Map.of();
    Object v29 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v27),((java.util.Map)v28));
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v30));
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v32));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._serializeAsString(((java.util.Date)v17),((com.fasterxml.jackson.core.JsonGenerator)v31),((com.fasterxml.jackson.databind.SerializerProvider)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).handledType();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = "]";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v13));
    Object v15 = java.util.Map.of();
    Object v16 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Throwable)v14),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = true;
    Object v14 = 0;
    Object v15 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v13),((java.text.DateFormat)v15));
    Object v17 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v12).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.BeanProperty)v17));
    Object v19 = 1;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.reflect.Type)v21),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.util.Map.of();
    Object v8 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v6),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8).expectBooleanFormat(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = 0;
    Object v9 = 29;
    Object v10 = -23;
    Object v11 = 0;
    Object v12 = -53;
    Object v13 = 9;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = java.util.Map.of();
    Object v18 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v16),((java.util.Map)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._serializeAsString(((java.util.Date)v14),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = "]";
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v14),((java.lang.String)v15));
    Object v17 = new java.io.ByteArrayOutputStream();
    Object v18 = new java.io.PrintWriter(((java.io.OutputStream)v17));
    ((java.lang.Throwable)v16).printStackTrace(((java.io.PrintWriter)v18));
    Object v19 = null;
    Object v20 = false;
    Object v21 = "";
    Object v22 = 7;
    Object v23 = "false";
    Object v24 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v20),((java.lang.String)v21),((java.lang.Integer)v22),((java.lang.String)v23));
    Object v25 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.Throwable)v16),((java.lang.Object)v24),(((java.lang.Integer)v25).intValue()));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._timestamp(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = "]";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = -8;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v9),((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).getDelegatee();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = 0;
    Object v5 = 29;
    Object v6 = -23;
    Object v7 = 0;
    Object v8 = -53;
    Object v9 = 9;
    Object v10 = new java.util.Date((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.util.Date)v10).getTimezoneOffset();
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = java.util.Map.of();
    Object v15 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13),((java.util.Map)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._serializeAsString(((java.util.Date)v10),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = true;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v6),((java.text.DateFormat)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).handledType();
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.util.Map.of();
    Object v13 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v11),((java.util.Map)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v14));
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v15));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v9));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.Map.of();
    Object v12 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).serialize(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v8).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v8).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).properties();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = java.util.Map.of();
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.util.Map.of();
    Object v16 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v14),((java.util.Map)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v19));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).serialize(((java.lang.Object)v12),((com.fasterxml.jackson.core.JsonGenerator)v18),((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = false;
    Object v9 = "";
    Object v10 = 7;
    Object v11 = "false";
    Object v12 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v8),((java.lang.String)v9),((java.lang.Integer)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._timestamp(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = "]";
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v19 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.Throwable)v17),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8).expectArrayFormat(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = true;
    Object v11 = 0;
    Object v12 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v10),((java.text.DateFormat)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v17 = ((com.fasterxml.jackson.databind.BeanProperty)v16).isVirtual();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v13).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v15),((com.fasterxml.jackson.databind.BeanProperty)v16));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v8).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.BeanProperty)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._timestamp(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v12 = ((com.fasterxml.jackson.databind.BeanProperty)v11).getMetadata();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v8).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new java.io.ByteArrayOutputStream();
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = java.util.Map.of();
    Object v16 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v14),((java.util.Map)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v19));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).serialize(((java.lang.Object)v12),((com.fasterxml.jackson.core.JsonGenerator)v18),((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.BeanProperty)v14));
    Object v16 = 0;
    Object v17 = 29;
    Object v18 = -23;
    Object v19 = 0;
    Object v20 = -53;
    Object v21 = 9;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    Object v24 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = java.util.Map.of();
    Object v26 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v24),((java.util.Map)v25));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v29));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15)._serializeAsString(((java.util.Date)v22),((com.fasterxml.jackson.core.JsonGenerator)v28),((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = true;
    Object v11 = 0;
    Object v12 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v10),((java.text.DateFormat)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v17 = ((com.fasterxml.jackson.databind.BeanProperty)v16).isVirtual();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v13).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v15),((com.fasterxml.jackson.databind.BeanProperty)v16));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v8).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v22).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.BeanProperty)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v22)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.util.Map.of();
    Object v8 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v6),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).serialize(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.util.Map.of();
    Object v13 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v11),((java.util.Map)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v14));
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = "]";
    Object v20 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = ",";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Throwable)v20),((java.lang.Object)v21),((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = true;
    Object v15 = 0;
    Object v16 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v14),((java.text.DateFormat)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v17).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v19),((com.fasterxml.jackson.databind.BeanProperty)v20));
    Object v22 = "m";
    Object v23 = "]";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonSerializer)v21).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v27 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v25),((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v13));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).getBindings();
    Object v12 = true;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11)._timestamp(((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = "]";
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = "]";
    Object v21 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v19),((java.lang.String)v20));
    ((java.lang.Throwable)v17).addSuppressed(((java.lang.Throwable)v21));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = "UNKNOWN";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.Throwable)v17),((java.lang.Object)v23),((java.lang.String)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = java.util.Map.of();
    Object v17 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v15),((java.util.Map)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = 1;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((com.fasterxml.jackson.databind.BeanProperty)v26));
    ((com.fasterxml.jackson.databind.ser.std.StdScalarSerializer)v11).serializeWithType(((java.lang.Object)v13),((com.fasterxml.jackson.core.JsonGenerator)v19),((com.fasterxml.jackson.databind.SerializerProvider)v21),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = "]";
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.Throwable)v17).fillInStackTrace();
    Object v19 = 0;
    Object v20 = 29;
    Object v21 = -23;
    Object v22 = 0;
    Object v23 = -53;
    Object v24 = 9;
    Object v25 = new java.util.Date((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 16;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.Throwable)v17),((java.lang.Object)v25),(((java.lang.Integer)v26).intValue()));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.BeanProperty)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = true;
    Object v13 = 0;
    Object v14 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = 29;
    Object v17 = -23;
    Object v18 = 0;
    Object v19 = -53;
    Object v20 = 9;
    Object v21 = new java.util.Date((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((java.text.DateFormat)v14).format(((java.util.Date)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).withFormat(((java.lang.Boolean)v12),((java.text.DateFormat)v14));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.BeanProperty)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.reflect.Type)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v12 = ((com.fasterxml.jackson.databind.BeanProperty)v11).getName();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v8).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.BeanProperty)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v15).handledType();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = true;
    Object v18 = 0;
    Object v19 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v17),((java.text.DateFormat)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    Object v23 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v20).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v22),((com.fasterxml.jackson.databind.BeanProperty)v23));
    ((com.fasterxml.jackson.databind.SerializerProvider)v16).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = "]";
    Object v29 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v27),((java.lang.String)v28));
    Object v30 = ((java.lang.Throwable)v29).getSuppressed();
    Object v31 = 1;
    Object v32 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v31).intValue()));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v33));
    Object v35 = "items";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.Throwable)v29),((java.lang.Object)v34),((java.lang.String)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v11).withFilterId(((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).isEmpty(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.BeanProperty)v6).isVirtual();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v12 = ((com.fasterxml.jackson.databind.BeanProperty)v11).getName();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v8).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v11));
    Object v14 = true;
    Object v15 = 0;
    Object v16 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v14),((java.text.DateFormat)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v17).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v19),((com.fasterxml.jackson.databind.BeanProperty)v20));
    Object v22 = "m";
    Object v23 = "]";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonSerializer)v21).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JsonSerializer)v25).withFilterId(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JsonSerializer)v13).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v29));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = true;
    Object v13 = 0;
    Object v14 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = 29;
    Object v17 = -23;
    Object v18 = 0;
    Object v19 = -53;
    Object v20 = 9;
    Object v21 = new java.util.Date((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((java.text.DateFormat)v14).format(((java.util.Date)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).withFormat(((java.lang.Boolean)v12),((java.text.DateFormat)v14));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v25).intValue()));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v23).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = true;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7)._acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.reflect.Type)v15),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v11).withFilterId(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v15).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v16),((com.fasterxml.jackson.databind.BeanProperty)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
    Object v10 = false;
    Object v11 = 0;
    Object v12 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = 29;
    Object v15 = -23;
    Object v16 = 0;
    Object v17 = -53;
    Object v18 = 9;
    Object v19 = new java.util.Date((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((java.text.DateFormat)v12).format(((java.util.Date)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).withFormat(((java.lang.Boolean)v10),((java.text.DateFormat)v12));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = "m";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v4),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = 0;
    Object v9 = 29;
    Object v10 = -23;
    Object v11 = 0;
    Object v12 = -53;
    Object v13 = 9;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = java.util.Map.of();
    Object v18 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v16),((java.util.Map)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._serializeAsString(((java.util.Date)v14),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.BeanProperty)v13));
    Object v15 = false;
    Object v16 = 0;
    Object v17 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).withFormat(((java.lang.Boolean)v15),((java.text.DateFormat)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.BeanProperty)v13));
    Object v15 = false;
    Object v16 = 0;
    Object v17 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).withFormat(((java.lang.Boolean)v15),((java.text.DateFormat)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v18)._asTimestamp(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v11).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = "]";
    Object v21 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v19),((java.lang.String)v20));
    Object v22 = java.util.Map.of();
    Object v23 = -2;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.Throwable)v21),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = "m";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = "m";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = 0;
    Object v18 = 29;
    Object v19 = -23;
    Object v20 = 0;
    Object v21 = -53;
    Object v22 = 9;
    Object v23 = new java.util.Date((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((java.util.Date)v23).toLocaleString();
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = java.util.Map.of();
    Object v28 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v26),((java.util.Map)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v31));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v16)._serializeAsString(((java.util.Date)v23),((com.fasterxml.jackson.core.JsonGenerator)v30),((com.fasterxml.jackson.databind.SerializerProvider)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = "m";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v16).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3)._timestamp(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v7).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = true;
    Object v15 = 0;
    Object v16 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v14),((java.text.DateFormat)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v17).handledType();
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.reflect.Type)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v11).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v11).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = new java.io.PrintWriter(((java.io.OutputStream)v6));
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = java.util.Map.of();
    Object v11 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v9),((java.util.Map)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v5).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = false;
    Object v5 = 0;
    Object v6 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).withFormat(((java.lang.Boolean)v4),((java.text.DateFormat)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = "]";
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v14),((java.lang.String)v15));
    Object v17 = true;
    Object v18 = 0;
    Object v19 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v17),((java.text.DateFormat)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    Object v23 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v24 = ((com.fasterxml.jackson.databind.BeanProperty)v23).isVirtual();
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v20).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v22),((com.fasterxml.jackson.databind.BeanProperty)v23));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = 1;
    Object v29 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v28).intValue()));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((com.fasterxml.jackson.databind.SerializerProvider)v27).getUnknownTypeSerializer(((java.lang.Class)v30));
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v25).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v27),((java.lang.Object)v32));
    Object v34 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.Throwable)v16),((java.lang.Object)v33),((java.lang.String)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = "m";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v16).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v22 = 1;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v20).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v21),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v20)._timestamp(((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = "m";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v16).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = true;
    Object v23 = 0;
    Object v24 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v23).intValue()));
    Object v25 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v22),((java.text.DateFormat)v24));
    Object v26 = false;
    Object v27 = 0;
    Object v28 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v25).withFormat(((java.lang.Boolean)v26),((java.text.DateFormat)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v30));
    Object v32 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v29).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v31),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v35 = ((com.fasterxml.jackson.databind.SerializerProvider)v21).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v33),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v37 = ((com.fasterxml.jackson.databind.BeanProperty)v36).getWrapperName();
    Object v38 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v20).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v21),((com.fasterxml.jackson.databind.BeanProperty)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v4));
    Object v6 = "m";
    Object v7 = "]";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v9).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = 0;
    Object v18 = 29;
    Object v19 = -23;
    Object v20 = 0;
    Object v21 = -53;
    Object v22 = 9;
    Object v23 = new java.util.Date((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = java.util.Map.of();
    Object v27 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v25),((java.util.Map)v26));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v30));
    ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v16)._serializeAsString(((java.util.Date)v23),((com.fasterxml.jackson.core.JsonGenerator)v29),((com.fasterxml.jackson.databind.SerializerProvider)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.DateSerializer(((java.lang.Boolean)v0),((java.text.DateFormat)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v3).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v6));
    Object v8 = "m";
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v11).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.BeanProperty)v13));
    Object v15 = false;
    Object v16 = 0;
    Object v17 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase)v14).withFormat(((java.lang.Boolean)v15),((java.text.DateFormat)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = "]";
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v21),((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = 12;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v18).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v19),((java.lang.Throwable)v23),((java.lang.Object)v25),(((java.lang.Integer)v26).intValue()));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
