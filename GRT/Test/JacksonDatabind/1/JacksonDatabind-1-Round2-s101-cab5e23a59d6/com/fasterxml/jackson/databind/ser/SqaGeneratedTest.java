package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = "";
    Object v36 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v37 = true;
    Object v38 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v35),((com.fasterxml.jackson.databind.AnnotationIntrospector)v36),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
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
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isConcrete();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = "Can not construct SimpleType for an array (class: ";
    Object v36 = "!";
    Object v37 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v35),((java.lang.String)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.Annotations)v11).get(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")o";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = false;
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
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
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = ((com.fasterxml.jackson.databind.util.Annotations)v11).size();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")o";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = "";
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.util.Annotations)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeStartObject();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getSetter();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).assignNullSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10).fixAccess();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = ((com.fasterxml.jackson.databind.util.Annotations)v12).size();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).getErasedSignature();
    Object v16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")o";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = false;
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).hasSerializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).getName();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not construct SimpleType for an array (class: ";
    Object v2 = "!";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v37 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v35),((com.fasterxml.jackson.databind.type.TypeFactory)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not construct SimpleType for an array (class: ";
    Object v2 = "!";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ")";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getViews();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not construct SimpleType for an array (class: ";
    Object v2 = "!";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
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
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "";
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).findObjectId(((java.lang.Object)v8),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v11));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getWrapperName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not construct SimpleType for an array (class: ";
    Object v2 = "!";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = ((com.fasterxml.jackson.databind.JavaType)v33).forcedNarrowBy(((java.lang.Class)v35));
    Object v37 = false;
    Object v38 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = new java.util.Date();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getField();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10).getDeclaringClass();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = ")o";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v27));
    Object v29 = "";
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = true;
    Object v32 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v29),((com.fasterxml.jackson.databind.AnnotationIntrospector)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),((java.lang.Object)v32));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = true;
    Object v37 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v34),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getContextAnnotation(((java.lang.Class)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32).getTypeInclusion();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isThrowable();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = true;
    Object v37 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.core.type.ResolvedType)v12).toCanonical();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).toString();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.core.type.ResolvedType)v34).toCanonical();
    Object v36 = false;
    Object v37 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not construct SimpleType for an array (class: ";
    Object v2 = "!";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v12).forcedNarrowBy(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")o";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = false;
    Object v38 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10).fixAccess();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = "Can not construct SimpleType for an array (class: ";
    Object v37 = "!";
    Object v38 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v36),((java.lang.String)v37));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getRawSerializationType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isThrowable();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((java.lang.reflect.Type)v12).getTypeName();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getGenericSignature();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = ((com.fasterxml.jackson.databind.util.Annotations)v11).size();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v38 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v36),((com.fasterxml.jackson.databind.type.TypeFactory)v37));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")o";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = "";
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.util.Annotations)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v12).withValueHandler(((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = ")o";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v27));
    Object v29 = "";
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = true;
    Object v32 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v29),((com.fasterxml.jackson.databind.AnnotationIntrospector)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),((java.lang.Object)v32));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = true;
    Object v37 = new java.util.Date();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v34),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v35),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getMember();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "number";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v1),((java.lang.Class)v3),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.core.type.ResolvedType)v34).toCanonical();
    Object v36 = false;
    Object v37 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).isRequired();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.util.Date();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.Annotations)v11).get(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")o";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = false;
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = true;
    Object v37 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v12).narrowBy(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")o";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = true;
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = ((java.lang.reflect.Type)v33).getTypeName();
    Object v35 = true;
    Object v36 = true;
    Object v37 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = true;
    Object v38 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v36),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.Annotations)v11).get(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ")o";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = false;
    Object v38 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = true;
    Object v36 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = "";
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1).optionalProperty(((java.lang.String)v2));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10).getDeclaringClass();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = true;
    Object v37 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = "s";
    Object v3 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1).property(((java.lang.String)v2),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).getAnnotated();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).getGenericSignature();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = ")o";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v27));
    Object v29 = "";
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = true;
    Object v32 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v29),((com.fasterxml.jackson.databind.AnnotationIntrospector)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),((java.lang.Object)v32));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = true;
    Object v37 = true;
    Object v38 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v37).booleanValue()));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v34),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ")o";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not construct SimpleType for an array (class: ";
    Object v2 = "!";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getAccessor();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = ((com.fasterxml.jackson.databind.util.Annotations)v11).size();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v34).isInterface();
    Object v36 = false;
    Object v37 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v38 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v37));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = "number";
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v2),((java.lang.Class)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = ((com.fasterxml.jackson.databind.util.Annotations)v11).size();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ")o";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v3).getOutputContext();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
