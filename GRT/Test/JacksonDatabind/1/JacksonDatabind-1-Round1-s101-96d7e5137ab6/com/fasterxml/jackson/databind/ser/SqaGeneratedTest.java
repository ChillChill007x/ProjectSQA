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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = "";
    Object v33 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v32),((com.fasterxml.jackson.databind.AnnotationIntrospector)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v35));
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
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v9),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = "Can not construct SimpleType for an array (class: ";
    Object v33 = "!";
    Object v34 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v34));
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
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
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.util.Annotations)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v12));
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
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
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10).getMember();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.Annotations)v12).get(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).isInterface();
    Object v18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = ")o";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = true;
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v30));
    Object v32 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31),((java.lang.Object)v32));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((com.fasterxml.jackson.databind.BeanProperty)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = true;
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JsonSerializer)v18),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v34),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = true;
    Object v33 = "Can not construct SimpleType for an array (class: ";
    Object v34 = "!";
    Object v35 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v33),((java.lang.String)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29).writeTypeSuffixForScalar(((java.lang.Object)v30),((com.fasterxml.jackson.core.JsonGenerator)v32));
    Object v33 = null;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
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
  public void test20() throws Throwable {
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).assignNullSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).toString();
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = "";
    Object v36 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v37 = true;
    Object v38 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v35),((com.fasterxml.jackson.databind.AnnotationIntrospector)v36),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = ")";
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29).writeCustomTypePrefixForScalar(((java.lang.Object)v30),((com.fasterxml.jackson.core.JsonGenerator)v32),((java.lang.String)v33));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.JavaType)v35).getGenericSignature();
    Object v37 = false;
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).hasGetter();
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = true;
    Object v33 = "";
    Object v34 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v33),((com.fasterxml.jackson.databind.AnnotationIntrospector)v34),(((java.lang.Boolean)v35).booleanValue()));
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v30).widenBy(((java.lang.Class)v32));
    Object v34 = false;
    Object v35 = "";
    Object v36 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v37 = true;
    Object v38 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v35),((com.fasterxml.jackson.databind.AnnotationIntrospector)v36),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
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
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isEnumType();
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v31).withTypeHandler(((java.lang.Object)v32));
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getGenericPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new java.lang.StringBuilder();
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v30).getErasedSignature(((java.lang.StringBuilder)v31));
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v36 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v34),((com.fasterxml.jackson.databind.type.TypeFactory)v35));
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getViews();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
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
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.node.ObjectNode)v3).size();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.databind.SerializerProvider)v5).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v7));
    Object v8 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
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
  public void test40() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).isExplicitlyIncluded();
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v31).forcedNarrowBy(((java.lang.Class)v33));
    Object v35 = true;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = true;
    Object v33 = "Can not construct SimpleType for an array (class: ";
    Object v34 = "!";
    Object v35 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v33),((java.lang.String)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getContextAnnotation(((java.lang.Class)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = new java.lang.StringBuilder();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).hasSerializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29).writeTypeSuffixForScalar(((java.lang.Object)v30),((com.fasterxml.jackson.core.JsonGenerator)v32));
    Object v33 = null;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = true;
    Object v37 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v30).forcedNarrowBy(((java.lang.Class)v32));
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = true;
    Object v38 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v36),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v37 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v35),((com.fasterxml.jackson.databind.type.TypeFactory)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v34));
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
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).hasSetter();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v13).withValueHandler(((java.lang.Object)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = ")o";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = true;
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v30));
    Object v32 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31),((java.lang.Object)v32));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((com.fasterxml.jackson.databind.BeanProperty)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = false;
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v37));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v18),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v34),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
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
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).isPublic();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v13).equals(((java.lang.Object)v14));
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = 29;
    Object v36 = -14;
    Object v37 = 15;
    Object v38 = new java.util.Date((((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29).getPropertyName();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).isEnumType();
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v33).equals(((java.lang.Object)v34));
    Object v36 = false;
    Object v37 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29).getTypeInclusion();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-2),Byte.valueOf((byte)9),Byte.valueOf((byte)0)};
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeBinary(((byte[])v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
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
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = ((com.fasterxml.jackson.databind.util.Annotations)v16).size();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = ")o";
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v31));
    Object v33 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.util.Annotations)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v32),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v22),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = false;
    Object v38 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JsonSerializer)v19),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
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
  public void test66() throws Throwable {
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = "Can not construct SimpleType for an array (class: ";
    Object v36 = "!";
    Object v37 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v35),((java.lang.String)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = true;
    Object v33 = "";
    Object v34 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v33),((com.fasterxml.jackson.databind.AnnotationIntrospector)v34),(((java.lang.Boolean)v35).booleanValue()));
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v33).isFinal();
    Object v35 = false;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
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
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getRawSerializationType();
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29).writeTypePrefixForScalar(((java.lang.Object)v30),((com.fasterxml.jackson.core.JsonGenerator)v32));
    Object v33 = null;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new java.lang.StringBuilder();
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v30).getGenericSignature(((java.lang.StringBuilder)v31));
    Object v33 = false;
    Object v34 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = "Can not construct SimpleType for an array (class: ";
    Object v33 = "!";
    Object v34 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = "Can not construct SimpleType for an array (class: ";
    Object v36 = "!";
    Object v37 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v35),((java.lang.String)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v3));
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
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
    Object v29 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = true;
    Object v34 = new java.lang.StringBuilder();
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JavaType)v32),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v34));
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = "boolan";
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v32),((java.lang.Class)v34),((java.lang.Class)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getMember();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = ((com.fasterxml.jackson.core.type.ResolvedType)v31).toCanonical();
    Object v33 = false;
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).isRequired();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.lang.StringBuilder();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
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
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = "";
    Object v36 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v37 = true;
    Object v38 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v35),((com.fasterxml.jackson.databind.AnnotationIntrospector)v36),(((java.lang.Boolean)v37).booleanValue()));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = true;
    Object v34 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v4),((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
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
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isEnumType();
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).isPrimitive();
    Object v33 = true;
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.lang.StringBuilder();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeFactory)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
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
    Object v14 = "";
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v13).equals(((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = ")o";
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v31));
    Object v33 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.util.Annotations)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v32),((java.lang.Object)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v22),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = true;
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v19),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v35),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).couldSerialize();
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
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v33 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = "nul";
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30).writeCustomTypeSuffixForScalar(((java.lang.Object)v31),((com.fasterxml.jackson.core.JsonGenerator)v33),((java.lang.String)v34));
    Object v35 = null;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = true;
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
