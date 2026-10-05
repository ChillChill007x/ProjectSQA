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
    Object v8 = "number";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = false;
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).serialize(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "Object id [%s] (for %s) at %s";
    Object v3 = "number";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "' ";
    Object v8 = "c";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = "";
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v23));
    Object v25 = false;
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v2),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findConvertingContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.BeanProperty)v26),((com.fasterxml.jackson.databind.JsonSerializer)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4));
    Object v6 = "'";
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = 6;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
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
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v3 = "Object id [%s] (for %s) at %s";
    Object v4 = "number";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = "' ";
    Object v9 = "c";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = "number";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = "number";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = "";
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v24));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v3),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v2),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = Short.valueOf((short)0);
    Object v30 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v29).shortValue()));
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30));
    Object v32 = "'";
    Object v33 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v31),((java.lang.String)v32));
    Object v34 = new java.util.TreeMap();
    Object v35 = 40;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v33),((java.lang.Object)v34),(((java.lang.Integer)v35).intValue()));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = Short.valueOf((short)0);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10));
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v14).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v16 = null;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).serialize(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v1));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "string";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v7),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = Short.valueOf((short)0);
    Object v9 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v8).shortValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = "'";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = " vs ";
    Object v2 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "Object id [%s] (for %s) at %s";
    Object v3 = "number";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "' ";
    Object v8 = "c";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = "";
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v23));
    Object v25 = false;
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v2),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v28 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v31));
    ((com.fasterxml.jackson.databind.JsonSerializer)v27).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v28),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v33 = null;
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findConvertingContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.BeanProperty)v26),((com.fasterxml.jackson.databind.JsonSerializer)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "]";
    Object v2 = false;
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = Short.valueOf((short)0);
    Object v9 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v8).shortValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = "'";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = "/string";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v12),((java.lang.Object)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "]";
    Object v2 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = Short.valueOf((short)0);
    Object v5 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v4).shortValue()));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v3),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = "number";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v4),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "' ";
    Object v9 = "c";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.util.TreeMap();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Object)v10),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "Object id [%s] (for %s) at %s";
    Object v3 = "number";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "' ";
    Object v8 = "c";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = "";
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v23));
    Object v25 = false;
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v2),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.BeanProperty)v26).getWrapperName();
    Object v28 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v29 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v30 = "number";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    ((com.fasterxml.jackson.databind.JsonSerializer)v28).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v29),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v34 = null;
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findConvertingContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.BeanProperty)v26),((com.fasterxml.jackson.databind.JsonSerializer)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "Object id [%s] (for %s) at %s";
    Object v3 = "number";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "' ";
    Object v8 = "c";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = "";
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v23));
    Object v25 = false;
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v2),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v27).handledType();
    Object v29 = ((com.fasterxml.jackson.databind.BeanProperty)v26).getContextAnnotation(((java.lang.Class)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findConvertingContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.BeanProperty)v26),((com.fasterxml.jackson.databind.JsonSerializer)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "arra?";
    Object v2 = true;
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v7).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v12));
    Object v13 = null;
    Object v14 = Short.valueOf((short)0);
    Object v15 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v14).shortValue()));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15));
    Object v17 = "'";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v16),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v20 = 22;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v18),((java.lang.Object)v19),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "') but ";
    Object v2 = true;
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "Object id [%s] (for %s) at %s";
    Object v3 = "number";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "' ";
    Object v8 = "c";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = "number";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = "";
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v23));
    Object v25 = false;
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v2),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.BeanProperty)v26).getFullName();
    Object v28 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findConvertingContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.BeanProperty)v26),((com.fasterxml.jackson.databind.JsonSerializer)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v3 = "Object id [%s] (for %s) at %s";
    Object v4 = "number";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = "' ";
    Object v9 = "c";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = "number";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = "number";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = "";
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v24));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v3),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v2),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v30 = " vs ";
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v29).createSchemaNode(((java.lang.String)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v31),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v2 = "arra?";
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).createSchemaNode(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "number";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).serialize(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = "' ";
    Object v8 = "c";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 23;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = "Multiple 'any-setters' defined (";
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v3 = "Object id [%s] (for %s) at %s";
    Object v4 = "number";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = "' ";
    Object v9 = "c";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = "number";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = "number";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = "";
    Object v22 = "number";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v24));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v3),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v2),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = Short.valueOf((short)0);
    Object v30 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v29).shortValue()));
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30));
    Object v32 = "'";
    Object v33 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v31),((java.lang.String)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v34).handledType();
    Object v36 = 15;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v33),((java.lang.Object)v35),(((java.lang.Integer)v36).intValue()));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Can not pass null JsonSerializer";
    Object v2 = false;
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = "' ";
    Object v5 = "c";
    Object v6 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "' ";
    Object v11 = "c";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v9),((com.fasterxml.jackson.databind.PropertyName)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v15 = "arra?";
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).createSchemaNode(((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v13),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = "true";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintWriter(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    ((java.lang.Throwable)v6).printStackTrace(((java.io.PrintWriter)v9));
    Object v10 = null;
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = "Trying to resolve a forward reference with id [";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "";
    Object v2 = true;
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = Short.valueOf((short)0);
    Object v9 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v8).shortValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = "'";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v10),((java.lang.String)v11));
    Object v13 = new java.util.TreeMap();
    Object v14 = ":";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v12),((java.lang.Object)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "string";
    Object v9 = new java.lang.Object[]{null};
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).mappingException(((java.lang.String)v8),((java.lang.Object[])v9));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).serialize(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = "true";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintWriter(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    ((java.lang.Throwable)v6).printStackTrace(((java.io.PrintWriter)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v12 = "]";
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).createSchemaNode(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "' ";
    Object v2 = "c";
    Object v3 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = Short.valueOf((short)0);
    Object v9 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v8).shortValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = "'";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v10),((java.lang.String)v11));
    Object v13 = "number";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = ": can not find property with name '";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v12),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = Short.valueOf((short)0);
    Object v5 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v4).shortValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "'";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v10 = "000";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v8),((java.lang.Object)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createObjectNode();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v8 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v7),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = "number";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createObjectNode();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = Short.valueOf((short)0);
    Object v8 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v7).shortValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = "'";
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.Throwable)v6).initCause(((java.lang.Throwable)v11));
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = 29;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).usesObjectId();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = Short.valueOf((short)0);
    Object v9 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v8).shortValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = "'";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.databind.JsonSerializer)v13).isUnwrappingSerializer();
    Object v21 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v12),((java.lang.Object)v20),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).isUnwrappingSerializer();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    Object v8 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v10).handledType();
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Object)v7),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "Object id [%s] (for %s) at %s";
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = "' ";
    Object v12 = "c";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = "";
    Object v25 = "number";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v6),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.databind.util.Annotations)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.fasterxml.jackson.databind.BeanProperty)v30).isRequired();
    Object v32 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v33 = "Failed to narrow type ";
    Object v34 = "Class ";
    Object v35 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v33),((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.JsonSerializer)v32).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v35));
    Object v37 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).findConvertingContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v30),((com.fasterxml.jackson.databind.JsonSerializer)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = "'";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "]";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v10),((java.lang.Object)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = "'";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v12 = " vs ";
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).createSchemaNode(((java.lang.String)v12));
    Object v14 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v10),((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
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
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
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
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v7 = Short.valueOf((short)0);
    Object v8 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v7).shortValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Object)v6),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = "'";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = "true";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintWriter(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    ((java.lang.Throwable)v10).printStackTrace(((java.io.PrintWriter)v13));
    Object v14 = null;
    Object v15 = 0L;
    Object v16 = java.time.Instant.ofEpochMilli((((java.lang.Long)v15).longValue()));
    Object v17 = java.util.Date.from(((java.time.Instant)v16));
    Object v18 = -44;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v10),((java.lang.Object)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "Object id [%s] (for %s) at %s";
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = "' ";
    Object v12 = "c";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = "number";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = "number";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = "";
    Object v25 = "number";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v6),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.databind.util.Annotations)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v32 = "Failed to narrow type ";
    Object v33 = "Class ";
    Object v34 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JsonSerializer)v31).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).findConvertingContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v30),((com.fasterxml.jackson.databind.JsonSerializer)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).createObjectNode();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ":";
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).createSchemaNode(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = Short.valueOf((short)0);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "'";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
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
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = "'";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = 0L;
    Object v12 = java.time.Instant.ofEpochMilli((((java.lang.Long)v11).longValue()));
    Object v13 = java.util.Date.from(((java.time.Instant)v12));
    Object v14 = "'; inject id ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v10),((java.lang.Object)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = "'";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.Throwable)v10).getStackTrace();
    Object v12 = new java.util.TreeMap();
    Object v13 = -14;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v10),((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "' ";
    Object v7 = "c";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "number";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Object)v8),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = Short.valueOf((short)0);
    Object v6 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v5).shortValue()));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v1),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v6 = "number";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = "'";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = "number";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v10),((java.lang.Object)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array";
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).createSchemaNode(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v6 = "";
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).createSchemaNode(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10));
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).serialize(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "";
    Object v2 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = Short.valueOf((short)0);
    Object v12 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v11).shortValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = "'";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v13),((java.lang.String)v14));
    Object v16 = Short.valueOf((short)0);
    Object v17 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v16).shortValue()));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17));
    Object v19 = "'";
    Object v20 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.Throwable)v15).initCause(((java.lang.Throwable)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer();
    Object v23 = "rray";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v15),((java.lang.Object)v22),((java.lang.String)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "number";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v8 = "";
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).createSchemaNode(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).findPropertyFilter(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Object)v6),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "WrAP_EXCEPTIONS";
    Object v2 = true;
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).createSchemaNode(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = "Failed to narrow type ";
    Object v2 = "Class ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = "'";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = Short.valueOf((short)0);
    Object v12 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v11).shortValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = "'";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v13),((java.lang.String)v14));
    Object v16 = ((java.lang.Throwable)v10).initCause(((java.lang.Throwable)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = "number";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v17).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.reflect.Type)v21));
    Object v23 = "'";
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v17).createSchemaNode(((java.lang.String)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v10),((java.lang.Object)v25),(((java.lang.Integer)v26).intValue()));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }
}
