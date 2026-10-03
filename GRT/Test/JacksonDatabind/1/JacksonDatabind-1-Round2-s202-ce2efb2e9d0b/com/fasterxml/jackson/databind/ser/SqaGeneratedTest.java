package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getInternalSetting(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getGenericPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getRawSerializationType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).getRawType();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29).getTypeIdResolver();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).isPrimitive();
    Object v33 = false;
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.util.Annotations)v9).size();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).toString();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 1;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = true;
    Object v33 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getSerializedName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setNonTrivialBaseType(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.type.TypeFactory)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getContextAnnotation(((java.lang.Class)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "##irrelevant";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isConcrete();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v10).withValueHandler(((java.lang.Object)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 1;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = true;
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ") in base64 content";
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v29).withStaticTyping();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).getRawType();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).hasSerializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getGetter();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ") in base64 content";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).getPropertyName();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = true;
    Object v31 = "";
    Object v32 = "##irrelevant";
    Object v33 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new java.lang.StringBuilder();
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v10).getGenericSignature(((java.lang.StringBuilder)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v21 = ")";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 1;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((java.lang.reflect.Type)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.util.Annotations)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v32).isConcrete();
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JavaType)v32),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "##irrelevant";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = "Broken registered ValueInstantiators (of type ";
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).writeCustomTypePrefixForObject(((java.lang.Object)v29),((com.fasterxml.jackson.core.JsonGenerator)v31),((java.lang.String)v32));
    Object v33 = null;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v36));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ") in base64 content";
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    ((com.fasterxml.jackson.databind.SerializerProvider)v7).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v9));
    Object v10 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getName();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v30));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).writeTypePrefixForArray(((java.lang.Object)v29),((com.fasterxml.jackson.core.JsonGenerator)v31));
    Object v32 = null;
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = true;
    Object v31 = new java.lang.StringBuilder();
    Object v32 = new java.lang.StringBuilder(((java.lang.CharSequence)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getMember();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getInternalName();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.Annotations)v10).get(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v22 = ")";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 1;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((java.lang.reflect.Type)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.PropertyName)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((java.lang.reflect.Type)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v10).equals(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = "";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v24 = ")";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = null;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 1;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v27),((java.lang.reflect.Type)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.PropertyName)v25),((com.fasterxml.jackson.databind.util.Annotations)v26),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((com.fasterxml.jackson.databind.BeanProperty)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.JavaType)v35).toString();
    Object v37 = true;
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v17),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v34),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).hasAnnotation(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.Annotations)v12).get(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = "";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v24 = ")";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = null;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 1;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v27),((java.lang.reflect.Type)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.PropertyName)v25),((com.fasterxml.jackson.databind.util.Annotations)v26),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((com.fasterxml.jackson.databind.BeanProperty)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = true;
    Object v37 = new java.lang.StringBuilder();
    Object v38 = new java.lang.StringBuilder(((java.lang.CharSequence)v37));
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JsonSerializer)v17),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v34),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).writeTypePrefixForScalar(((java.lang.Object)v30),((com.fasterxml.jackson.core.JsonGenerator)v32),((java.lang.Class)v34));
    Object v35 = null;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = false;
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v29).isInterface();
    Object v31 = true;
    Object v32 = ") in base64 content";
    Object v33 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v32),((com.fasterxml.jackson.databind.AnnotationIntrospector)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).hasAnnotation(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v21 = ")";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 1;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((java.lang.reflect.Type)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.util.Annotations)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = false;
    Object v34 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v35 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JavaType)v32),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v32 = ")";
    Object v33 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isEnumType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.Annotations)v9).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).toCanonical();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v22 = ")";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 1;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((java.lang.reflect.Type)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.PropertyName)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isContainerType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = "";
    Object v30 = "##irrelevant";
    Object v31 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v33 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v32));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).writeTypeSuffixForScalar(((java.lang.Object)v31),((com.fasterxml.jackson.core.JsonGenerator)v33));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = true;
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).removeInternalSetting(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getInternalName();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v30).isPrimitive();
    Object v32 = true;
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v22 = ")";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 1;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((java.lang.reflect.Type)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.PropertyName)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).getAnnotated();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v33 = ")";
    Object v34 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).setInternalSetting(((java.lang.Object)v1),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getMutator();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = ((com.fasterxml.jackson.databind.util.Annotations)v10).size();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 1;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).getGenericType();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((com.fasterxml.jackson.core.type.ResolvedType)v30).toCanonical();
    Object v32 = true;
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = ((com.fasterxml.jackson.databind.util.Annotations)v13).size();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = "";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v23 = ")";
    Object v24 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = 1;
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v26),((java.lang.reflect.Type)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.PropertyName)v24),((com.fasterxml.jackson.databind.util.Annotations)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.Annotations)v9).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v21 = ")";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 1;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((java.lang.reflect.Type)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.util.Annotations)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JavaType)v32),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).assignNullSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).hasNullSerializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v4 = ")";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v7),((java.lang.reflect.Type)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v13),((com.fasterxml.jackson.core.JsonGenerator)v15),((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).getTypeIdResolver();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v5));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v3),((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.Annotations)v9).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).withStaticTyping();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v22 = ")";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = 1;
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((java.lang.reflect.Type)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.PropertyName)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JavaType)v33),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).getConstructorParameter();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).isPrimitive();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 1;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).isEnumType();
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v36 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v34),((com.fasterxml.jackson.databind.type.TypeFactory)v35));
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v29).withValueHandler(((java.lang.Object)v30));
    Object v32 = true;
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "integer";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v1),((java.lang.Class)v3),((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsField(((java.lang.Object)v6),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v10).withValueHandler(((java.lang.Object)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 1;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = "";
    Object v33 = "##irrelevant";
    Object v34 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v31).equals(((java.lang.Object)v34));
    Object v36 = false;
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = true;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ") in base64 content";
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
  public void test75() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v29).getErasedSignature();
    Object v31 = false;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = true;
    Object v31 = ") in base64 content";
    Object v32 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v33 = false;
    Object v34 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v31),((com.fasterxml.jackson.databind.AnnotationIntrospector)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).couldSerialize();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ((com.fasterxml.jackson.core.type.ResolvedType)v29).toCanonical();
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).writeTypePrefixForScalar(((java.lang.Object)v29),((com.fasterxml.jackson.core.JsonGenerator)v31),((java.lang.Class)v33));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = true;
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v35),(((java.lang.Boolean)v36).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = "w)";
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).writeCustomTypePrefixForObject(((java.lang.Object)v29),((com.fasterxml.jackson.core.JsonGenerator)v31),((java.lang.String)v32));
    Object v33 = null;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ") in base64 content";
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = false;
    Object v14 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v10).withValueHandler(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = "";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v23 = ")";
    Object v24 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = 1;
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v26),((java.lang.reflect.Type)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.PropertyName)v24),((com.fasterxml.jackson.databind.util.Annotations)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = false;
    Object v36 = false;
    Object v37 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v36).booleanValue()));
    Object v38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isEnumType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new java.lang.StringBuilder();
    Object v32 = new java.lang.StringBuilder(((java.lang.CharSequence)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v30).getErasedSignature(((java.lang.StringBuilder)v32));
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v34).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).hasGetter();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = false;
    Object v32 = new java.lang.StringBuilder();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.util.Annotations)v9).size();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = false;
    Object v31 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v33 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = "Invalid 'any-setter' annotation on method ";
    ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29).writeCustomTypeSuffixForArray(((java.lang.Object)v31),((com.fasterxml.jackson.core.JsonGenerator)v33),((java.lang.String)v34));
    Object v35 = null;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = true;
    Object v38 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v36),(((java.lang.Boolean)v37).booleanValue()),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.util.Annotations)v9).size();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).isPrimitive();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 1;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = "string";
    Object v7 = 0.0D;
    ((com.fasterxml.jackson.core.JsonGenerator)v5).writeNumberField(((java.lang.String)v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsColumn(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v5),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.util.Annotations)v9).size();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).getErasedSignature();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v20 = ")";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 1;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v23),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JavaType)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).hasAnnotation(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v21 = ")";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 1;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((java.lang.reflect.Type)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.util.Annotations)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = true;
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JavaType)v32),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isEnumType();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v19 = ")";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((com.fasterxml.jackson.databind.BeanProperty)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v30).getGenericSignature();
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v29),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v11).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v21 = ")";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 1;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((java.lang.reflect.Type)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.util.Annotations)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JavaType)v32),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = true;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3).hasGetter();
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).hasAnnotation(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = "";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v23 = ")";
    Object v24 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = 1;
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v26),((java.lang.reflect.Type)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.PropertyName)v24),((com.fasterxml.jackson.databind.util.Annotations)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = true;
    Object v36 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33),((com.fasterxml.jackson.databind.JavaType)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.Annotations)v9).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v21 = ")";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 1;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((java.lang.reflect.Type)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.util.Annotations)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v31),((com.fasterxml.jackson.databind.JavaType)v32),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = ") in base64 content";
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((java.lang.String)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = "USE_BIG_DECIMAL_FOR_FLOATS";
    Object v18 = ")";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v21),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.PropertyName)v19),((com.fasterxml.jackson.databind.util.Annotations)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28).getTypeIdResolver();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = true;
    Object v32 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v28),((com.fasterxml.jackson.databind.JavaType)v30),(((java.lang.Boolean)v31).booleanValue()),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
