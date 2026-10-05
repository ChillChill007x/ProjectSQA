package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = null;
    Object v19 = ";";
    Object v20 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v18),((java.lang.String)v19));
    Object v21 = 0;
    Object v22 = new java.util.HashMap((((java.lang.Integer)v21).intValue()));
    Object v23 = "WRITE_SINGL-E_ELEM_ARRAYS_UNWRAPPED";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.Throwable)v20),((java.lang.Object)v22),((java.lang.String)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((java.lang.reflect.Type)v24).getTypeName();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = "]";
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v24),((com.fasterxml.jackson.databind.util.NameTransformer)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = "0items";
    Object v25 = "";
    Object v26 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = true;
    Object v29 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v26),((com.fasterxml.jackson.databind.AnnotationIntrospector)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v24),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v29),((com.fasterxml.jackson.databind.util.Annotations)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = "]";
    Object v34 = "string";
    Object v35 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v33),((java.lang.String)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v32),((com.fasterxml.jackson.databind.util.NameTransformer)v35));
    Object v37 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.BeanProperty)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "0items";
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.BeanProperty)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = null;
    Object v14 = ";";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = "]";
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18),((com.fasterxml.jackson.databind.util.NameTransformer)v21));
    Object v23 = 48;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.Throwable)v16),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v26).expectArrayFormat(((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v26),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v25));
    Object v27 = "]";
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).convertValue(((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = null;
    Object v4 = ";";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = 19;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v6),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = null;
    Object v7 = ";";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = ";";
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v9),((java.lang.String)v10));
    Object v12 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v8),((java.lang.Object)v11),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "]";
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JsonSerializer)v25).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v28));
    ((com.fasterxml.jackson.databind.SerializerProvider)v23).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v29));
    Object v30 = null;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "items";
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.String)v7),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v5),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = "]";
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v21),((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v25).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v28 = null;
    Object v29 = ((com.fasterxml.jackson.databind.JsonSerializer)v19).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v25));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22)._findSerializer(((java.lang.Object)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = false;
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v25));
    Object v27 = "";
    Object v28 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).handledType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "0items";
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = "]";
    Object v35 = "string";
    Object v36 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v34),((java.lang.String)v35));
    Object v37 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v33),((com.fasterxml.jackson.databind.util.NameTransformer)v36));
    Object v38 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.BeanProperty)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = 0;
    Object v25 = new java.util.HashMap((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = "]";
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v24),((com.fasterxml.jackson.databind.util.NameTransformer)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).convertValue(((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = ((java.lang.reflect.Type)v32).getTypeName();
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v32),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "]";
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JsonSerializer)v25).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v28));
    ((com.fasterxml.jackson.databind.SerializerProvider)v23).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v29));
    Object v30 = null;
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "items";
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.String)v7),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v5),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = null;
    Object v23 = ";";
    Object v24 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v22),((java.lang.String)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = "]";
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v26),((com.fasterxml.jackson.databind.util.NameTransformer)v29));
    Object v31 = "d)";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v19).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v21),((java.lang.Throwable)v24),((java.lang.Object)v30),((java.lang.String)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getConverter();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "Sub0-class ";
    Object v26 = new java.lang.Object[]{null};
    Object v27 = ((com.fasterxml.jackson.databind.SerializerProvider)v24).mappingException(((java.lang.String)v25),((java.lang.Object[])v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = null;
    Object v9 = ";";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v11),((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = false;
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getDelegatee();
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = "]";
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7),((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = null;
    Object v9 = ";";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v10),((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "0items";
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).handledType();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = null;
    Object v5 = ";";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = " from Boolean valuZe (";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v7),((java.lang.Object)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider)v23).setProvider(((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v23),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = false;
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = "]";
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v10),((com.fasterxml.jackson.databind.util.NameTransformer)v13));
    ((com.fasterxml.jackson.databind.SerializerProvider)v8).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v14));
    Object v15 = null;
    Object v16 = null;
    Object v17 = ";";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v21 = -24;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v19),((java.lang.Object)v20),(((java.lang.Integer)v21).intValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = null;
    Object v9 = ";";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v11),((java.lang.Object)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "]";
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.core.type.ResolvedType)v24).toCanonical();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "]";
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v25),((com.fasterxml.jackson.databind.util.NameTransformer)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v29).handledType();
    Object v31 = ((java.lang.reflect.Type)v30).getTypeName();
    Object v32 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v30));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = null;
    Object v4 = ";";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4));
    Object v6 = "]";
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "Can not add mapping from class to itself";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v5),((java.lang.Object)v8),((java.lang.String)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = null;
    Object v8 = ";";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = "@";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v9),((java.lang.Object)v10),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v28));
    ((com.fasterxml.jackson.databind.SerializerProvider)v27).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v29));
    Object v30 = null;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v27),((java.lang.reflect.Type)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = "]";
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v26),((com.fasterxml.jackson.databind.util.NameTransformer)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v30).handledType();
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v24).widenBy(((java.lang.Class)v31));
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = true;
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v25),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = "0items";
    Object v25 = "";
    Object v26 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = true;
    Object v29 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v26),((com.fasterxml.jackson.databind.AnnotationIntrospector)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v24),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v29),((com.fasterxml.jackson.databind.util.Annotations)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.BeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = "true";
    Object v25 = new java.lang.Object[]{null};
    Object v26 = ((com.fasterxml.jackson.databind.SerializerProvider)v23).mappingException(((java.lang.String)v24),((java.lang.Object[])v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = true;
    Object v36 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v34),(((java.lang.Boolean)v35).booleanValue()));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v1).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = true;
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v32),(((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = null;
    Object v9 = ";";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    ((java.lang.Throwable)v10).printStackTrace();
    Object v11 = null;
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v16),((com.fasterxml.jackson.databind.PropertyName)v18));
    Object v20 = "in";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v10),((java.lang.Object)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeFactory)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = null;
    Object v9 = ";";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v12 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v10),((java.lang.Object)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v29).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v32 = null;
    Object v33 = "]";
    Object v34 = "string";
    Object v35 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v33),((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.JsonSerializer)v29).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v35));
    ((com.fasterxml.jackson.databind.SerializerProvider)v27).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v36));
    Object v37 = null;
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = null;
    Object v9 = ";";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v10));
    Object v12 = "true";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintWriter(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    ((java.lang.Throwable)v11).printStackTrace(((java.io.PrintWriter)v14));
    Object v15 = null;
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "Trying to resolve a forward reference with id [";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v11),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = "]";
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v26),((com.fasterxml.jackson.databind.util.NameTransformer)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v30).handledType();
    Object v32 = true;
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonSerializer)v24).usesObjectId();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "]";
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v25),((com.fasterxml.jackson.databind.util.NameTransformer)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v29).handledType();
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v26).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v29 = null;
    Object v30 = "]";
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonSerializer)v26).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "string";
    Object v4 = new java.lang.Object[]{null};
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    Object v6 = null;
    Object v7 = ";";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v10 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v8),((java.lang.Object)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "]";
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v25),((com.fasterxml.jackson.databind.util.NameTransformer)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v29).handledType();
    Object v31 = true;
    Object v32 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v23),((java.lang.reflect.Type)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = "]";
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v26),((com.fasterxml.jackson.databind.util.NameTransformer)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v30).handledType();
    Object v32 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = null;
    Object v8 = ";";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "'";
    Object v16 = false;
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((java.lang.Class)v24),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v25));
    Object v27 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v10),((java.lang.Object)v26),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = "0items";
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.BeanProperty)v33).getMetadata();
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.BeanProperty)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = "";
    Object v24 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = "]";
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v26),((com.fasterxml.jackson.databind.util.NameTransformer)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v30).handledType();
    Object v32 = false;
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v26).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v29 = null;
    Object v30 = "]";
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonSerializer)v26).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    ((com.fasterxml.jackson.databind.SerializerProvider)v24).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v33));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "items";
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.String)v7),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v5),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = null;
    Object v23 = ";";
    Object v24 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v22),((java.lang.String)v23));
    Object v25 = "";
    Object v26 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v25));
    Object v27 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v19).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v21),((java.lang.Throwable)v24),((java.lang.Object)v26),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = null;
    Object v5 = ";";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = null;
    Object v8 = ";";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v7),((java.lang.String)v8));
    Object v10 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v6),((java.lang.Object)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = null;
    Object v4 = ";";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v5),((java.lang.Object)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = null;
    Object v4 = ";";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v5),((java.lang.Object)v6),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v26).expectArrayFormat(((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v29).isEnumType();
    ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v26),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = null;
    Object v8 = ";";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v11 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v9),((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v27));
    Object v29 = "";
    Object v30 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v28),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = "]";
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v1),((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = null;
    Object v9 = ";";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.Throwable)v10).getSuppressed();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = "[";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v10),((java.lang.Object)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = null;
    Object v4 = ";";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).handledType();
    Object v12 = 3;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v1).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v5),((java.lang.Object)v11),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v1).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = null;
    Object v12 = ";";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = "]";
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16),((com.fasterxml.jackson.databind.util.NameTransformer)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v20).handledType();
    Object v22 = 27;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v14),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "]";
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3),((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "items";
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer)v7),((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer(((com.fasterxml.jackson.databind.util.Converter)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = "]";
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer(((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v26),((com.fasterxml.jackson.databind.util.NameTransformer)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v30).handledType();
    Object v32 = ((java.lang.reflect.Type)v31).getTypeName();
    Object v33 = true;
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer)v22).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v31),(((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertNotNull(v34);
  }
}
