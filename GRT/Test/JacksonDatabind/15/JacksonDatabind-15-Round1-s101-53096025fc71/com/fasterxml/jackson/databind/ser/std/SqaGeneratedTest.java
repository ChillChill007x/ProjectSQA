package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((com.fasterxml.jackson.databind.BeanProperty)v22));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).serializeWithType(((java.lang.Object)v10),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v23));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.core.JsonFactory();
    Object v27 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v26));
    Object v28 = true;
    Object v29 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).serializeFieldsFiltered(((java.lang.Object)v25),((com.fasterxml.jackson.core.JsonGenerator)v29),((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = "stri_ng";
    Object v7 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v5),((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).serializeFieldsFiltered(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.core.JsonFactory();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).serializeFields(((java.lang.Object)v5),((com.fasterxml.jackson.core.JsonGenerator)v9),((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ": can not instantiame from JSON object (need to add/enable type information?)";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4)._customTypeId(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = "itekms";
    Object v8 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.core.JsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16),((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = -5;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = "Ca";
    Object v30 = new java.util.TreeSet();
    Object v31 = new java.lang.Object[]{null,null};
    Object v32 = com.fasterxml.jackson.databind.util.ArrayBuilders.setAndArray(((java.util.Set)v30),((java.lang.Object[])v31));
    Object v33 = com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.Object)v28),((java.lang.String)v29),((java.util.Collection)v32));
    ((java.lang.Throwable)v33).printStackTrace();
    Object v34 = null;
    Object v35 = null;
    Object v36 = "stri_ng";
    Object v37 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),((java.lang.String)v36));
    Object v38 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v33),((java.lang.Object)v37),((java.lang.String)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ": can not instantiame from JSON object (need to add/enable type information?)";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isEmpty(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.util.TreeSet();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = new com.fasterxml.jackson.core.JsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = "Failed to parse type '";
    Object v16 = new java.lang.Object[]{null,null,null};
    Object v17 = ((com.fasterxml.jackson.databind.SerializerProvider)v14).mappingException(((java.lang.String)v15),((java.lang.Object[])v16));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).serializeFields(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23),((com.fasterxml.jackson.databind.BeanProperty)v24));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4)._serializeWithObjectId(((java.lang.Object)v12),((com.fasterxml.jackson.core.JsonGenerator)v16),((com.fasterxml.jackson.databind.SerializerProvider)v17),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).serializeWithType(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v20));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isInterface();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6)._serializeWithObjectId(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new java.util.TreeSet();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ": can not instantiame from JSON object (need to add/enable type information?)";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.core.JsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v20));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6)._serializeWithObjectId(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new java.util.TreeSet();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).serialize(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).getDelegatee();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).isEmpty(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).serialize(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v19),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).serializeFieldsFiltered(((java.lang.Object)v12),((com.fasterxml.jackson.core.JsonGenerator)v16),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.reflect.Type)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v21).isContainerType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6)._serializeWithObjectId(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.reflect.Type)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).handledType();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "itekms";
    Object v9 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.core.JsonFactory();
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = -5;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((java.lang.reflect.Type)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Ca";
    Object v31 = new java.util.TreeSet();
    Object v32 = new java.lang.Object[]{null,null};
    Object v33 = com.fasterxml.jackson.databind.util.ArrayBuilders.setAndArray(((java.util.Set)v31),((java.lang.Object[])v32));
    Object v34 = com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(((com.fasterxml.jackson.core.JsonParser)v12),((java.lang.Object)v29),((java.lang.String)v30),((java.util.Collection)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v35));
    Object v37 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v34),((java.lang.Object)v36),(((java.lang.Integer)v37).intValue()));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = "h)]";
    Object v18 = "[AnnotedC";
    Object v19 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.Object)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v19 = null;
    Object v20 = "itekms";
    Object v21 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.core.JsonFactory();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).serialize(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = true;
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v15).booleanValue()),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.core.JsonFactory();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.type.TypeFactory)v28));
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v29),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31).getTypeInclusion();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.impl.WritableObjectId(((com.fasterxml.jackson.annotation.ObjectIdGenerator)v35));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14)._serializeObjectId(((java.lang.Object)v17),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.ser.impl.WritableObjectId)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.core.JsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory();
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v15),(((java.lang.Boolean)v16).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v13).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v17));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((com.fasterxml.jackson.databind.BeanProperty)v25));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6)._serializeWithObjectId(((java.lang.Object)v8),((com.fasterxml.jackson.core.JsonGenerator)v12),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).isEmpty(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new java.lang.String[]{"lass ","' from Class '"};
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v21).withIgnorals(((java.lang.String[])v22));
    ((com.fasterxml.jackson.databind.SerializerProvider)v16).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v23));
    Object v24 = null;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = "itekms";
    Object v8 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.core.JsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16),((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = -5;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = "Ca";
    Object v30 = new java.util.TreeSet();
    Object v31 = new java.lang.Object[]{null,null};
    Object v32 = com.fasterxml.jackson.databind.util.ArrayBuilders.setAndArray(((java.util.Set)v30),((java.lang.Object[])v31));
    Object v33 = com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.Object)v28),((java.lang.String)v29),((java.util.Collection)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v34));
    Object v36 = "No";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v33),((java.lang.Object)v35),((java.lang.String)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v20));
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).serializeWithType(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v21));
    Object v22 = null;
    Object v23 = "h)]";
    Object v24 = "[AnnotedC";
    Object v25 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ")";
    Object v27 = ((com.fasterxml.jackson.databind.util.NameTransformer)v25).transform(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v25));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v20));
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).serializeWithType(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v11),((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v21));
    Object v22 = null;
    Object v23 = "h)]";
    Object v24 = "[AnnotedC";
    Object v25 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ")";
    Object v27 = ((com.fasterxml.jackson.databind.util.NameTransformer)v25).transform(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v25));
    Object v29 = ((com.fasterxml.jackson.databind.JsonSerializer)v28).getDelegatee();
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v20 = null;
    Object v21 = null;
    Object v22 = "stri_ng";
    Object v23 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withFilterId(((java.lang.Object)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = new java.lang.String[]{"lass ","' from Class '"};
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v11).withIgnorals(((java.lang.String[])v12));
    Object v14 = new com.fasterxml.jackson.core.JsonFactory();
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = new com.fasterxml.jackson.core.JsonFactory();
    Object v33 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v32));
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v36));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v27).writeTypePrefixForObject(((java.lang.Object)v31),((com.fasterxml.jackson.core.JsonGenerator)v35),((java.lang.Class)v37));
    Object v38 = null;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6)._serializeWithObjectId(((java.lang.Object)v13),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v19),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v27));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = true;
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v16).booleanValue()),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.core.JsonFactory();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v22).writeNumber(((java.lang.String)v23));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).serializeFields(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.core.JsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).serializeFields(((java.lang.Object)v16),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).isEmpty(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.lang.Object[]{null,null};
    Object v18 = com.fasterxml.jackson.databind.util.ArrayBuilders.setAndArray(((java.util.Set)v16),((java.lang.Object[])v17));
    Object v19 = new com.fasterxml.jackson.core.JsonFactory();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).serializeFieldsFiltered(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{", probleu: ","R"};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).serializeFieldsFiltered(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v19),((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = "itekms";
    Object v10 = com.fasterxml.jackson.databind.node.TextNode.valueOf(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = -5;
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((java.lang.reflect.Type)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Ca";
    Object v32 = new java.util.TreeSet();
    Object v33 = new java.lang.Object[]{null,null};
    Object v34 = com.fasterxml.jackson.databind.util.ArrayBuilders.setAndArray(((java.util.Set)v32),((java.lang.Object[])v33));
    Object v35 = com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException.from(((com.fasterxml.jackson.core.JsonParser)v13),((java.lang.Object)v30),((java.lang.String)v31),((java.util.Collection)v34));
    Object v36 = ": can not instantiame from JSON object (need to add/enable type information?)";
    Object v37 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v36));
    Object v38 = "need JSON String that contains type id (for subtypefof ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.Throwable)v35),((java.lang.Object)v37),((java.lang.String)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{", probleu: ","R"};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = "not a valid textual representation";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.String)v25),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v17).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v21),((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = true;
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v15).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.reflect.Type)v26),(((java.lang.Boolean)v27).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = "not a valid textual representation";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.String)v25),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v30));
    Object v32 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v31).usesObjectId();
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v20 = null;
    Object v21 = null;
    Object v22 = "stri_ng";
    Object v23 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withFilterId(((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v24).asArraySerializer();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.core.JsonFactory();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    Object v24 = new com.fasterxml.jackson.core.JsonFactory();
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v25),(((java.lang.Boolean)v26).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v23).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v27));
    Object v28 = null;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).serializeFieldsFiltered(((java.lang.Object)v17),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = ": can not instantiame from JSON object (need to add/enable type information?)";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v17),((java.lang.Class)v19),((java.lang.Class)v21),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withFilterId(((java.lang.Object)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v17),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = false;
    Object v29 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.reflect.Type)v26),(((java.lang.Boolean)v28).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "not a valid textual representation";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v16),((java.lang.String)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v20 = null;
    Object v21 = null;
    Object v22 = "stri_ng";
    Object v23 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withFilterId(((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v24).asArraySerializer();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = "not a valid textual representation";
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v29));
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v26),((java.lang.String)v27),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v25).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v25).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).asArraySerializer();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.reflect.Type)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v22),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).asArraySerializer();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).asArraySerializer();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "not a valid textual representation";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v11));
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = true;
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v15).booleanValue()),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.core.JsonFactory();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v28),((com.fasterxml.jackson.databind.BeanProperty)v29));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14)._serializeWithObjectId(((java.lang.Object)v17),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).asArraySerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withFilterId(((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = "not a valid textual representation";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v27));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.String)v25),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v31)._customTypeId(((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).asArraySerializer();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.reflect.Type)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.core.JsonFactory();
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10));
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((com.fasterxml.jackson.databind.BeanProperty)v22));
    ((com.fasterxml.jackson.databind.JsonSerializer)v7).serializeWithType(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v23));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).isEmpty(((java.lang.Object)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v20 = null;
    Object v21 = null;
    Object v22 = "stri_ng";
    Object v23 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withFilterId(((java.lang.Object)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v24).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v26));
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v24).asArraySerializer();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = "not a valid textual representation";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.String)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v25),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).asArraySerializer();
    Object v9 = ": can not instantiame from JSON object (need to add/enable type information?)";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v22),((com.fasterxml.jackson.databind.BeanProperty)v23));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8).serializeWithType(((java.lang.Object)v10),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).asArraySerializer();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new java.lang.String[]{"lass ","' from Class '"};
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v13).withIgnorals(((java.lang.String[])v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "not a valid textual representation";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v16),((java.lang.String)v17),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).isEmpty(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).asArraySerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withFilterId(((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v18).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v20 = null;
    Object v21 = null;
    Object v22 = "stri_ng";
    Object v23 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).withFilterId(((java.lang.Object)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v24).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v26));
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v24).asArraySerializer();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = new com.fasterxml.jackson.core.JsonFactory();
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v30));
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v34));
    Object v36 = false;
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v28)._serializeWithObjectId(((java.lang.Object)v29),((com.fasterxml.jackson.core.JsonGenerator)v33),((com.fasterxml.jackson.databind.SerializerProvider)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withFilterId(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.reflect.Type)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).asArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).asArraySerializer();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = ((com.fasterxml.jackson.databind.JsonSerializer)v16).isEmpty(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "not a valid textual representation";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v11));
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v15).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).asArraySerializer();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).handledType();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).asArraySerializer();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.core.JsonFactory();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).serializeFieldsFiltered(((java.lang.Object)v5),((com.fasterxml.jackson.core.JsonGenerator)v9),((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).asArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v7).asArraySerializer();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16).expectObjectFormat(((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{", probleu: ","R"};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = false;
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v16).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.reflect.Type)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = "not a valid textual representation";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v24));
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v21),((java.lang.String)v22),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.ser.BeanSerializer.createDummy(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new java.lang.String[]{"lass ","' from Class '"};
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v4).withIgnorals(((java.lang.String[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "not a valid textual representation";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v6).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v13));
    Object v15 = new java.lang.String[]{", probleu: ","R"};
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v14).withIgnorals(((java.lang.String[])v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = false;
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v16).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.reflect.Type)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = "not a valid textual representation";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v24));
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v21),((java.lang.String)v22),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v16).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = "not a valid textual representation";
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(((com.fasterxml.jackson.databind.JavaType)v29),((java.lang.String)v30),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.fasterxml.jackson.databind.ser.std.BeanSerializerBase)v28).withObjectIdWriter(((com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter)v35));
    org.junit.Assert.assertNotNull(v36);
  }
}
