package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).assignNullSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not build, 'ini()' not yet called";
    Object v2 = ", problem: /";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "type must be provid0d";
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v3),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).hasNullSerializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v2),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getGenericPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getWrapperName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).hasSerializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getRawSerializationType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "array";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new byte[]{Byte.valueOf((byte)0)};
    Object v7 = 0;
    Object v8 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v5).writeBinary(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "aray";
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "aray";
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v6),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).isRequired();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isInterface();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setNonTrivialBaseType(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not build, 'ini()' not yet called";
    Object v2 = ", problem: /";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "aray";
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "aray";
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v6),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "array";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Can not build, 'ini()' not yet called";
    Object v5 = ", problem: /";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = "stEring";
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1).property(((java.lang.String)v2),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getContextAnnotation(((java.lang.Class)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = ")";
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1).optionalProperty(((java.lang.String)v2));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getViews();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not build, 'ini()' not yet called";
    Object v2 = ", problem: /";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getSerializationType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "array";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getAnnotation(((java.lang.Class)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).willSuppressNulls();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not build, 'ini()' not yet called";
    Object v2 = ", problem: /";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "`";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeNull();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeStartArray();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v2),((java.lang.reflect.Type)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getMember();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v9),((java.lang.Object)v10));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "aray";
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = ")";
    Object v10 = 7.3735766F;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumberField(((java.lang.String)v9),(((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not build, 'ini()' not yet called";
    Object v2 = ", problem: /";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "K";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = ")";
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeFieldName(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ")";
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeNumber(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "BeanSerializer for ";
    Object v6 = false;
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "aray";
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.canBeABeanType(((java.lang.Class)v12));
    Object v14 = new java.lang.StringBuilder(((java.lang.CharSequence)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v4),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "array";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not build, 'ini()' not yet called";
    Object v2 = ", problem: /";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ")Bfrom non-Array representation (token: ";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = ((com.fasterxml.jackson.databind.node.BaseJsonNode)v3).traverse(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v6).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v8));
    Object v9 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 14;
    Object v6 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).findObjectId(((java.lang.Object)v10),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "type must be provid0d";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "aray";
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v6),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v7),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v2),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = "BeanSerializer for ";
    Object v6 = false;
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v8),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicBooleanSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = ": ";
    Object v5 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).without(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v5));
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeTree(((com.fasterxml.jackson.core.TreeNode)v6));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
