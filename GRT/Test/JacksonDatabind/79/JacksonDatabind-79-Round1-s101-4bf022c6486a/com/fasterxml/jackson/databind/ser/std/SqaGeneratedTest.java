package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = 0L;
    Object v11 = -47;
    Object v12 = 19;
    Object v13 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3)._customTypeId(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).serialize(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{": "};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13).withSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v19).properties();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14)._customTypeId(((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v15).getUnknownTypeSerializer(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.reflect.Type)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).usesObjectId();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).getUnknownTypeSerializer(((java.lang.Class)v15));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).serializeFieldsFiltered(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v13));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "array2";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ")";
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v30),((java.lang.String)v31));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).serializeWithType(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32));
    Object v33 = null;
    Object v34 = new java.util.Date();
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).getDelegatee();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8)._customTypeId(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.reflect.Type)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).usesObjectId();
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).serializeFieldsFiltered(((java.lang.Object)v16),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = "]";
    Object v24 = new java.lang.Object[]{};
    Object v25 = ((com.fasterxml.jackson.databind.SerializerProvider)v22).mappingException(((java.lang.String)v23),((java.lang.Object[])v24));
    Object v26 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16)._serializeWithObjectId(((java.lang.Object)v17),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22),(((java.lang.Boolean)v26).booleanValue()));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14)._customTypeId(((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = 0L;
    Object v21 = -47;
    Object v22 = 19;
    Object v23 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v19),(((java.lang.Long)v20).longValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16)._customTypeId(((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
    Object v6 = new java.util.Date();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9));
    ((com.fasterxml.jackson.core.JsonGenerator)v10).close();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).serialize(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = 0L;
    Object v19 = -47;
    Object v20 = 19;
    Object v21 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).serializeFields(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.reflect.Type)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14)._customTypeId(((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new java.io.ByteArrayOutputStream();
    Object v17 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).properties();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    ((com.fasterxml.jackson.core.JsonGenerator)v20).setCurrentValue(((java.lang.Object)v21));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.SerializerProvider)v23).getUnknownTypeSerializer(((java.lang.Class)v25));
    Object v27 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14)._serializeWithObjectId(((java.lang.Object)v16),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v23),(((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).serialize(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.reflect.Type)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.Object)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = "EEE, dd MMpM yyyy HH:mm:ss zzz";
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v27));
    Object v29 = "string:";
    Object v30 = com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition.construct(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v33));
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v18),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v31),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).findConvertingSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v17),((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8).properties();
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = new java.io.PrintWriter(((java.io.OutputStream)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8)._serializeWithObjectId(((java.lang.Object)v11),((com.fasterxml.jackson.core.JsonGenerator)v15),((com.fasterxml.jackson.databind.SerializerProvider)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v15).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.reflect.Type)v19),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{": "};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = "EEE, dd MMpM yyyy HH:mm:ss zzz";
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v27));
    Object v29 = "string:";
    Object v30 = com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition.construct(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v33));
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v18),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v31),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v17),((com.fasterxml.jackson.databind.BeanProperty)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v16));
    Object v18 = "array2";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v28 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v28));
    Object v30 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v29));
    Object v31 = ((com.fasterxml.jackson.core.JsonGenerator)v30).getCodec();
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).serialize(((java.lang.Object)v26),((com.fasterxml.jackson.core.JsonGenerator)v30),((com.fasterxml.jackson.databind.SerializerProvider)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).asArraySerializer();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new java.io.ByteArrayOutputStream();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15)._serializeWithObjectId(((java.lang.Object)v16),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15)._customTypeId(((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = "array2";
    Object v28 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v30));
    Object v32 = true;
    Object v33 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.PropertyName)v28),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v23).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v34).asArraySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v19).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v35));
    Object v36 = null;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).asArraySerializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.JsonSerializer)v21).isEmpty(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = java.lang.ClassLoader.getSystemClassLoader();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v18));
    ((com.fasterxml.jackson.core.JsonGenerator)v19).writeEndArray();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).serializeFields(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v19),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = "Q";
    Object v20 = "doule";
    Object v21 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v15),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).usesObjectId();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "EEE, dd MMpM yyyy HH:mm:ss zzz";
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = "string:";
    Object v16 = com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition.construct(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v4),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v16),((com.fasterxml.jackson.databind.util.Annotations)v17),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3)._customTypeId(((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).asArraySerializer();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = ((com.fasterxml.jackson.core.JsonGenerator)v26).getCurrentValue();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v21)._serializeWithObjectId(((java.lang.Object)v22),((com.fasterxml.jackson.core.JsonGenerator)v26),((com.fasterxml.jackson.databind.SerializerProvider)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).serializeFields(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = "Q";
    Object v16 = "doule";
    Object v17 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).serializeFieldsFiltered(((java.lang.Object)v17),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = "]";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = "array2";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = "";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v23));
    Object v25 = false;
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.BeanProperty)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18)._customTypeId(((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new java.io.ByteArrayOutputStream();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).serialize(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v15),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v22).expectNumberFormat(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v28));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v21).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v22),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = 0L;
    Object v23 = -47;
    Object v24 = 19;
    Object v25 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v21),(((java.lang.Long)v22).longValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v27 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v27));
    Object v29 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v28));
    Object v30 = new java.io.ByteArrayOutputStream();
    ((com.fasterxml.jackson.core.JsonGenerator)v29).writeObjectId(((java.lang.Object)v30));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = ((com.fasterxml.jackson.databind.SerializerProvider)v32).getUnknownTypeSerializer(((java.lang.Class)v34));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).serializeFields(((java.lang.Object)v25),((com.fasterxml.jackson.core.JsonGenerator)v29),((com.fasterxml.jackson.databind.SerializerProvider)v32));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    ((com.fasterxml.jackson.databind.JsonSerializer)v3).serialize(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = "array2";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v24));
    Object v26 = true;
    Object v27 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v17).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v28).asArraySerializer();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v29).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v30),((java.lang.reflect.Type)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.Object)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v27).asArraySerializer();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = "array2";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v25));
    Object v27 = true;
    Object v28 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.PropertyName)v23),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = "NUMBER";
    Object v17 = new java.lang.Object[]{null,null,null};
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v15).mappingException(((java.lang.String)v16),((java.lang.Object[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.reflect.Type)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v13).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8).serialize(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).asArraySerializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = ((com.fasterxml.jackson.databind.SerializerProvider)v27).getUnknownTypeSerializer(((java.lang.Class)v29));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v21).serialize(((java.lang.Object)v22),((com.fasterxml.jackson.core.JsonGenerator)v26),((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).asArraySerializer();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((java.lang.reflect.Type)v24).getTypeName();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v21).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v22),((java.lang.reflect.Type)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).withFilterId(((java.lang.Object)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v11).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = "]";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = "array2";
    Object v24 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = "";
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((java.lang.Class)v30),((java.lang.String)v31),((java.lang.Class)v33));
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.PropertyName)v24),((com.fasterxml.jackson.databind.util.Annotations)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34),(((java.lang.Boolean)v35).booleanValue()));
    Object v37 = ")";
    Object v38 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((com.fasterxml.jackson.databind.BeanProperty)v36),((java.lang.String)v37));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).serializeWithType(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v38));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).withFilterId(((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v20).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v27).asArraySerializer();
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v28).handledType();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = true;
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v27).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v29),((java.lang.reflect.Type)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).serializeFieldsFiltered(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v27).withFilterId(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v33).hasGenericTypes();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v27).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v30),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v27).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v28));
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((java.lang.reflect.Type)v33).getTypeName();
    Object v35 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v27).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v31),((java.lang.reflect.Type)v33));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "i";
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).mappingException(((java.lang.String)v5),((java.lang.Object[])v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).asArraySerializer();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((java.lang.reflect.Type)v24).getTypeName();
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v21).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v22),((java.lang.reflect.Type)v24),(((java.lang.Boolean)v26).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{": "};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).properties();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{": "};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).properties();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).asArraySerializer();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{": "};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).properties();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).asArraySerializer();
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).usesObjectId();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31));
    ((com.fasterxml.jackson.databind.SerializerProvider)v28).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v32));
    Object v33 = null;
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = ((com.fasterxml.jackson.databind.JsonSerializer)v27).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v28),((java.lang.Object)v34));
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new java.io.ByteArrayOutputStream();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).serializeFields(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = "";
    Object v16 = new java.io.File(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).serializeFieldsFiltered(((java.lang.Object)v16),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = "Q";
    Object v20 = "doule";
    Object v21 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v22).asArraySerializer();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v34 = ((com.fasterxml.jackson.core.JsonGenerator)v32).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v36 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v27)._serializeWithObjectId(((java.lang.Object)v28),((com.fasterxml.jackson.core.JsonGenerator)v32),((com.fasterxml.jackson.databind.SerializerProvider)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = "Q";
    Object v20 = "doule";
    Object v21 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v22).asArraySerializer();
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v23).usesObjectId();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v18).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v19),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((com.fasterxml.jackson.databind.SerializerProvider)v25).getUnknownTypeSerializer(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((java.lang.reflect.Type)v30).getTypeName();
    Object v32 = true;
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v18).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v25),((java.lang.reflect.Type)v30),(((java.lang.Boolean)v32).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = "Q";
    Object v20 = "doule";
    Object v21 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v22).asArraySerializer();
    Object v24 = "";
    Object v25 = new java.io.File(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v23).withFilterId(((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v23).usesObjectId();
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = "Q";
    Object v20 = "doule";
    Object v21 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v21));
    Object v23 = "array2";
    Object v24 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v26 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v25));
    Object v27 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = true;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v22)._serializeWithObjectId(((java.lang.Object)v24),((com.fasterxml.jackson.core.JsonGenerator)v28),((com.fasterxml.jackson.databind.SerializerProvider)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v15),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).withFilterId(((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v20).serialize(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withFilterId(((java.lang.Object)v5));
    Object v7 = new java.lang.String[]{"array"};
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withIgnorals(((java.lang.String[])v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8)._customTypeId(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = "EEE, dd MMpM yyyy HH:mm:ss zzz";
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v27));
    Object v29 = "string:";
    Object v30 = com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition.construct(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v33));
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v18),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v31),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v17),((com.fasterxml.jackson.databind.BeanProperty)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).withFilterId(((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    Object v23 = "sting";
    Object v24 = new java.lang.Object[]{null,null,null};
    Object v25 = ((com.fasterxml.jackson.databind.SerializerProvider)v22).mappingException(((java.lang.String)v23),((java.lang.Object[])v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v20).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v22),((java.lang.reflect.Type)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = "array2";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v28));
    Object v30 = "array2";
    Object v31 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.JsonSerializer)v27).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v29),((java.lang.Object)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = "array2";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v3).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withFilterId(((java.lang.Object)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withIgnorals(((java.lang.String[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = "array2";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v25));
    Object v27 = true;
    Object v28 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.PropertyName)v23),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v18).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v29).asArraySerializer();
    org.junit.Assert.assertNotNull(v30);
  }
}
